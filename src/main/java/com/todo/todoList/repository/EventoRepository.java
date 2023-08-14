package com.todo.todoList.repository;

import com.todo.todoList.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository  extends JpaRepository<Evento,Long> {}
