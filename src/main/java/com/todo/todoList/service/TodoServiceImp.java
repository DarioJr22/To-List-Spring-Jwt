package com.todo.todoList.service;

import com.todo.todoList.model.Task;
import com.todo.todoList.model.User;
import com.todo.todoList.repository.TodoRepository;
import com.todo.todoList.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

@Service

public class TodoServiceImp  implements TodoService{

    @Autowired TodoRepository TaskRepo;
    @Autowired UserRepository userRepository;
    @Override
    public Task saveTask(Task task) {
        TaskRepo.save(task);
        return task;
    }

    @Override
    public ArrayList<Task> getTasks() {

        return (ArrayList<Task>) TaskRepo.findAll();
    }

    @Override
    public Task putTask(Task taskUp, Long id) {
        User user = userRepository.findById(taskUp.getUsuario().getId()).get();
        taskUp.setUsuario(user);
        return TaskRepo.save(taskUp);
    }

    @Override
    public Object deleteTask(Long id) {
        Object task = TaskRepo.findById(id);
        TaskRepo.deleteById(id);
        return task;
    }
}
