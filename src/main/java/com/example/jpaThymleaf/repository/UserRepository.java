package com.example.jpaThymleaf.repository;

import com.example.jpaThymleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
