package com.todo.todoList.repository;

import com.todo.todoList.model.Modules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModulesRepository extends JpaRepository<Modules,Long> {
}
