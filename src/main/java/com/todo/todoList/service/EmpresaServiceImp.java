package com.todo.todoList.service;

import com.todo.todoList.model.Empresa;
import com.todo.todoList.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpresaServiceImp implements  EmpresaService{
    @Autowired
    EmpresaRepository repository;
    @Override
    public Empresa createEmpresa(Empresa E) {
        return repository.save(E);
    }

    @Override
    public ArrayList<Empresa> getEmpresa() {
        return (ArrayList<Empresa>) repository.findAll();
    }

    @Override
    public Empresa putEmpresa(Empresa E) {
        return repository.save(E);
    }

    @Override
    public Optional<Empresa> deleteEmpresa(Long id) {
        Optional<Empresa> e = repository.findById(id);
        repository.deleteById(id);
        return e;
    }
}
