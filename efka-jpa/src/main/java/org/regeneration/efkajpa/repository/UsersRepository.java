package org.regeneration.efkajpa.repository;

import org.regeneration.efkajpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
        Users findByUsername(String username);
        boolean existsByUsername(String username);
}
