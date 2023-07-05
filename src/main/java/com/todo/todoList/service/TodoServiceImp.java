package com.todo.todoList.service;

import com.todo.todoList.model.Task;
import com.todo.todoList.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service

public class TodoServiceImp  implements TodoService{

    @Autowired TodoRepository TaskRepo;

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
        Task taskOld = TaskRepo.findById(id).get();

        if(Objects.nonNull(taskUp.getName()) && Objects.nonNull(taskUp.getName()) && Objects.nonNull(taskUp.getName()) ){

            taskOld.setName(taskUp.getName());
            taskOld.setData_ini(taskUp.getData_ini());
            taskOld.setData_fin(taskUp.getData_fin());
            taskOld.setTask_ini(taskOld.getTask_ini());
            taskOld.setTask_fin(taskOld.getTask_fin());
        }

        return TaskRepo.save(taskOld);
    }

    @Override
    public void deleteTask(Long id) {
        TaskRepo.deleteById(id);
    }
}
