package com.srhdp.springboot4.role.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.srhdp.springboot4.role.entity.Role;
import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}