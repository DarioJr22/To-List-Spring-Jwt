package com.todo.todoList.controller;


import com.todo.todoList.model.MenuModules;
import com.todo.todoList.service.MenuModuleService;
import com.todo.todoList.service.MenuModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/fiscal")
public class FiscalController {
@Autowired
    MenuModulesService menuModulesService;
    @GetMapping("/menu")
        public ArrayList<MenuModules> getMenuOptions(String moduleName){
        ArrayList<MenuModules> answer = this.menuModulesService.readMenuByModule("Fiscal");
        return answer;
    }

}
