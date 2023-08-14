package com.todo.todoList.service;


import com.todo.todoList.model.Task;

import java.util.ArrayList;

public interface TodoService {

    Task saveTask(Task task);
    ArrayList<Task> getTasks();

    Task putTask(Task taskUp,Long id);

    Object deleteTask(Long id);


}
