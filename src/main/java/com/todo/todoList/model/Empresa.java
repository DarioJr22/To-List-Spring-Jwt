package com.todo.todoList.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name= "Empresa")
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
    @Id
    @Column(name = "id",nullable = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao",nullable = false)
    private String name;

    @Column(name = "CNPJ")
    private String cnpj;


    @OneToMany(mappedBy = "empresa_user")
    private List<User> users = new ArrayList<User>();


    @OneToMany(mappedBy = "empresa_evento")
    private List<Evento> eventos = new ArrayList<Evento>();
    }

