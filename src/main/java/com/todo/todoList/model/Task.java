package com.todo.todoList.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name= "todo")
@AllArgsConstructor
@NoArgsConstructor
public class Task {


@Id
@Column(name="id",nullable = false)
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name="descricao",nullable = false,length = 244)
private String name;

@Column(name="data", nullable = false)
private Date date;

@Column(name="taskInit")
private Boolean taskInit;


@Column(name="taskEnd")
private Boolean taskEnd;

@ManyToOne
@JoinColumn(name = "usuario",nullable = false,updatable = false)
private User usuario;
//Num JOINB



}
