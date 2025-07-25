package com.example.backend_spring.domain.accounts.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.backend_spring.domain.accounts.model.Account;
import com.example.backend_spring.domain.users.model.User;

public interface AccountRepository extends JpaRepository<Account, UUID>, JpaSpecificationExecutor<Account> {
    Optional<Account> findByAccountNumber(String accountNumber);
    Optional<Account> findByUser(User user);
    boolean existsByAccountNumber(String accountNumber);
    List<Account> findAllByAccountNumberIn(List<String> accountNumberList);
}
