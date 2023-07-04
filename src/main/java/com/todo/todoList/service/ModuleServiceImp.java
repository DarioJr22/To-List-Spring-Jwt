package com.todo.todoList.service;


import com.todo.todoList.model.Modules;
import com.todo.todoList.repository.ModulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ModuleServiceImp implements  ModulesService{

    @Autowired ModulesRepository moduleRepository;
    @Override
    public Modules saveModule(Modules module) {
        moduleRepository.save(module);
        return module;
    }

    @Override
    public ArrayList<Modules> getModules() {
        ArrayList<Modules> list = (ArrayList<Modules>) moduleRepository.findAll();
        return list;
    }

    @Override
    public String deleteModule(Long id) {
        moduleRepository.deleteById(id);
        return "Deletado";
    }
}
