package com.todo.todoList.service;

import com.todo.todoList.model.MenuModules;

import java.util.ArrayList;

public interface MenuModulesService {
MenuModules createMenu(MenuModules menuOption);

ArrayList<MenuModules> readMenuByModule(String moduleName);

MenuModules putMenuModules(MenuModules menuModules);

String deleteMenuModules(Long id);



}
