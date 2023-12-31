package com.todo.todoList.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
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

@Column(name="data_ini", nullable = false)
private Date data_ini;

@Column(name="data_fin")
private Date data_fin;

@Column(name="taskInit")
private Boolean task_ini;


@Column(name="taskEnd")
private Boolean task_fin;

@ManyToOne
@JsonIgnore
@JoinColumn(name = "usuario",nullable = false,updatable = false)
private User usuario;
//Num JOINB



}
