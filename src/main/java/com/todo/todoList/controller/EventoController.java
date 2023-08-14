package com.todo.todoList.controller;


import com.todo.todoList.model.Empresa;
import com.todo.todoList.model.Evento;
import com.todo.todoList.service.EmpresaServiceImp;
import com.todo.todoList.service.EventoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    EventoServiceImp service;

    @PostMapping
    public Evento[] create(@RequestBody Evento[] e) {
        return service.createEvento(e);
    }


    @GetMapping
    public ArrayList<Evento> get() {
        return service.get();
    }


    @PutMapping
    public Evento[] put(@RequestBody Evento[] e) {

        return service.update(e);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {

        service.delete(id);
    }
}
