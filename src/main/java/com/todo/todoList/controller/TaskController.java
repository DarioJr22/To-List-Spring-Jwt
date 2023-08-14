package com.todo.todoList.controller;


import com.todo.todoList.model.Task;
import com.todo.todoList.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Task")
public class TaskController {


    @Autowired TodoService todoService;
    @GetMapping("/get")
    public ArrayList<Task> getTasks(){
        return (ArrayList<Task>) todoService.getTasks();
    }

    @PostMapping("/post")
    public Task postTask(@RequestBody Task task){
        return todoService.saveTask(task);
    }

    @PutMapping("/{id}")
    public Task putTask(@RequestBody Task task,@PathVariable("id") Long id){
        return todoService.putTask(task,id);
    }


    //Erro na entidade de respostas
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTask(@PathVariable("id") Long id){
         Object objDeletado = todoService.deleteTask(id);

        return new ResponseEntity<Object>(objDeletado, HttpStatus.OK) ;

    }
}
