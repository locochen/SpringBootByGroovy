package com.example.demo.controller

import com.example.demo.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    UserService userService

    @GetMapping('/user/{id}')
    ResponseEntity<User> userList(@PathVariable long id)
    {
        new ResponseEntity<User>(userService.findUser(id),HttpStatus.OK)
    }
    @GetMapping('/generate-user')
    ResponseEntity<User> create()
    {
        new ResponseEntity<User>(userService.createUser(),HttpStatus.OK)
    }
}
