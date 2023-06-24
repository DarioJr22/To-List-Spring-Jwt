package com.todo.todoList.controller;


import com.todo.todoList.dto.Login;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    @PostMapping("/login")
    private String login(@RequestBody Login login){
        return "Login";
    }
}
