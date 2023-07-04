package com.todo.todoList.service;


import com.todo.todoList.model.Modules;

import java.util.ArrayList;

public interface ModulesService {

    Modules saveModule(Modules module);

    ArrayList<Modules>getModules();

    String deleteModule(Long id);
}
