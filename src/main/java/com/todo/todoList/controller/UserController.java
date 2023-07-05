package com.todo.todoList.controller;

import com.todo.todoList.model.Login;
import com.todo.todoList.model.User;
import com.todo.todoList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired UserService UserService;

    @GetMapping("/get")
    public ArrayList<User> getUsers(){
        return UserService.getUser();
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody Login login){
        User userInvalid = new User(null,null,null,null,null);
        User response = UserService.loginUser(login) != null ? UserService.loginUser(login) : userInvalid  ;


        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PostMapping("/post")
    public User postUsers(@RequestBody User user){
        return UserService.saveUser(user);
    };

    @PutMapping("/{id}")
    public User putUsers(@RequestBody User userUp,@PathVariable("id") Long id){
        return UserService.putUser(userUp, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        UserService.deleteUser(id);
    }

}
