package app.development.domain.account.service;

import app.development.domain.account.entity.Account;

import java.util.Optional;

public interface AccountService {

    Optional<Account> findByEmail(String email);

}
