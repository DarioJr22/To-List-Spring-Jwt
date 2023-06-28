package com.todo.todoList.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class todoConfig {
 @Bean
 public todoListProperty todoListProperty(){
     return new todoListProperty();
 }
}
