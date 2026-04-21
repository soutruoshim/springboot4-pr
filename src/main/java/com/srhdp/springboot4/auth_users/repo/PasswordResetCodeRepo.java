package com.srhdp.springboot4.auth_users.repo;

import com.srhdp.springboot4.auth_users.entity.PasswordResetCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetCodeRepo extends JpaRepository<PasswordResetCode, Long> {

    Optional<PasswordResetCode> findByCode(String code);
    void deleteByUserId(Long userId);
}

