package com.todo.todoList.service;

import com.todo.todoList.model.Login;
import com.todo.todoList.model.User;

import java.util.ArrayList;

public interface UserService {

    User saveUser(User user);

    ArrayList<User> getUser();

    User putUser(User userUp, Long ud);

    String deleteUser(Long id);

    User loginUser(Login login);
}
