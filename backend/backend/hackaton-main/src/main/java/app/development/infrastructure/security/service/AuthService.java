package app.development.infrastructure.security.service;

import app.development.infrastructure.security.model.AccountUserDetail;
import app.development.infrastructure.security.model.LoginRequestDTO;
import app.development.infrastructure.security.model.LoginResponseDTO;

public interface AuthService {

    LoginResponseDTO authenticate(LoginRequestDTO loginRequestDTO);

    AccountUserDetail validateAndGetDetails(String token);
}
