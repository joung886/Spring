package com.dw.basicapp.Controller;

import com.dw.basicapp.Service.UserService;
import com.dw.basicapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/api/register")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return new ResponseEntity<>(
                userService.saveUser(user),
                HttpStatus.OK);
    }
    @GetMapping("/api/user/all")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(
                userService.getAllUsers(),
                HttpStatus.OK);
    }
}
