package com.todo.todoList.controller;


import com.todo.todoList.model.Empresa;
import com.todo.todoList.service.EmpresaService;
import com.todo.todoList.service.EmpresaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController  {

    @Autowired
    EmpresaServiceImp service;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa e) {
        return service.createEmpresa(e);
    }


    @GetMapping
    public ArrayList<Empresa> getEmpresa() {
        return service.getEmpresa();
    }


    @PutMapping
    public Empresa putEmpresa(@RequestBody Empresa e) {
        return service.putEmpresa(e);
    }

    @DeleteMapping("/{id}")
    public Optional<Empresa> deleteEmpresa(@PathVariable("id") Long id) {
        return service.deleteEmpresa(id);
    }
}
