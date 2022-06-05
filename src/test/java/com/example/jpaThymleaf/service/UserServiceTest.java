package com.example.jpaThymleaf.service;

import com.example.jpaThymleaf.model.Role;
import com.example.jpaThymleaf.model.User;
import com.example.jpaThymleaf.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    EntityManager em;

    /*@Test
    @Rollback(false)
    void save() {
        User user = new User();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        System.out.println("encodedPassword = " + encodedPassword);
        user.setPassword(encodedPassword);
        System.out.println("userPassword = " + user.getPassword());
        user.setEnabled(true);
        Role role = new Role();
        role.setId(1l);
        user.getRoles().add(role);

        //then
        em.flush();//인서트문 날려줌
        assertEquals(user, userRepository.findOne(user.getId()));
    }*/
}