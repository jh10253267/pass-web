package com.example.passweb.repository.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DataJpaTest

class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void userFindTest() {
//        Optional<UserEntity> result = userRepository.findByUserId("A1000000");
//        UserEntity user = result.orElseThrow();
//        System.out.println(user);
    }
}