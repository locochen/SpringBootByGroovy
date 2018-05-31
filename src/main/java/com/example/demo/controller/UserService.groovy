package com.example.demo.controller

import com.example.demo.UserRepository
import com.example.demo.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    UserRepository userRepository;

    User findUser(long id)
    {
//        userRepository.save(this.generateUser())
        userRepository.getOne(Long.valueOf(id))
    }

    User createUser()
    {
        userRepository.save(new User(name: 'pong',age: 30))
    }
}
