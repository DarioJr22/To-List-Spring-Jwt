package com.todo.todoList.service;

import com.todo.todoList.model.Empresa;
import com.todo.todoList.model.MenuModules;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Optional;

public interface EmpresaService {
    Empresa createEmpresa(Empresa e);

    ArrayList<Empresa> getEmpresa();

    Empresa putEmpresa(Empresa e);

    Optional<Empresa> deleteEmpresa(Long id);


}
