package com.todo.todoList.service;

import com.todo.todoList.model.MenuModules;
import com.todo.todoList.model.Modules;
import com.todo.todoList.repository.MenuModulesRepository;
import com.todo.todoList.repository.ModulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MenuModuleService implements MenuModulesService{
@Autowired
MenuModulesRepository repository;

@Autowired
    ModulesRepository modulesRepository;


    @Override
    public MenuModules createMenu(MenuModules menuOption) {
        this.repository.save(menuOption);
        return menuOption;
    }

    @Override
    public ArrayList<MenuModules> readMenuByModule(String moduleName) {
      ArrayList<MenuModules> modules = new ArrayList<MenuModules>();
      ArrayList<MenuModules> menuModules = (ArrayList<MenuModules>) repository.findAll();

      for(MenuModules i:menuModules){
          if (i.getModules().getNome() == moduleName ){
            modules.add(i);
          };
      }
        return modules;
    }

    @Override
    public MenuModules putMenuModules(MenuModules menuModules) {
        MenuModules newModule = repository.save(menuModules);
        return newModule;
    }

    @Override
    public String deleteMenuModules(Long id) {
        repository.deleteById(id);
        return "Modulo " + id + " deletado !";
    }
}
