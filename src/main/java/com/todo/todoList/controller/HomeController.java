package com.todo.todoList.controller;


import com.todo.todoList.model.Modules;
import com.todo.todoList.service.ModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/home")
public class HomeController {
@Autowired
    ModulesService moduleService;

@GetMapping("/getmodules")
        public ArrayList<Modules> getModules(){
        ArrayList<Modules> arrayList = (ArrayList<Modules>) moduleService.getModules();
        return arrayList;
}

@PostMapping("/post")
    public Modules postModules(@RequestBody Modules module){
        moduleService.saveModule(module);
        return module;
    }
}

