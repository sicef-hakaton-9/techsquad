package app.development.infrastructure.security.service;

import app.development.domain.account.entity.Account;
import app.development.domain.account.service.AccountService;
import app.development.infrastructure.security.model.AccountUserDetail;
import app.development.infrastructure.security.model.LoginRequestDTO;
import app.development.infrastructure.security.model.LoginResponseDTO;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    @Value("${jwt.signing-secret}")
    private String signingSecret;

    @Value("${jwt.expiration-time-seconds}")
    private long expirationTime;

    private final AccountService accountService;

    public AuthServiceImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public LoginResponseDTO authenticate(LoginRequestDTO loginRequestDTO) {
        var loginEmail = loginRequestDTO.email();
        Optional<Account> optionalAccount = accountService.findByEmail(loginEmail);

        if (optionalAccount.isEmpty()) {
            throw new RuntimeException("Account doesn't exist by security");
        }

        Account account = optionalAccount.get();

        if (!loginRequestDTO.password().equals(account.getPassword())) {
            throw new RuntimeException("Bad data");
        }

        return new LoginResponseDTO(generateToken(account));
    }

    @Override
    public AccountUserDetail validateAndGetDetails(String token) {
        String email = validateToken(token);
        var optionalEmail = accountService.findByEmail(email);

        if (optionalEmail.isEmpty()) {
            throw new RuntimeException("Not found email");
        }

        return new AccountUserDetail(optionalEmail.get());
    }

    public String generateToken(Account account) {

        var claims = new HashMap<String, Object>();
        claims.put("id", account.getId());
        claims.put("role", account.getRole().getName());

        var now = System.currentTimeMillis();
        var exp = now + expirationTime * 1000;

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(account.getEmail())
                .setIssuedAt(new Date(now))
                .setExpiration(new Date(exp))
                .signWith(SignatureAlgorithm.HS512, signingSecret).compact();
    }

    public String validateToken(String token) {
        try {
            Claims claims = Jwts.parser().setSigningKey(signingSecret).parseClaimsJws(token).getBody();

            return claims.getSubject();
        } catch (SignatureException | ExpiredJwtException ex) {
            throw new RuntimeException("Token invalid");
        }
    }
}
