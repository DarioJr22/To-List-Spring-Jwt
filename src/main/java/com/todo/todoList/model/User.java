package com.todo.todoList.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",unique = true,nullable = false,length = 60)
    private String nome;

    @Column(name="login", unique =true,nullable = false)
    private String login;

    @Column(name="senha",nullable = false)
    private String senha;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario")
    private List<Task> tasks = new ArrayList<Task>();

    @ManyToOne
    @JoinColumn(name = "empresa_user",nullable = false,updatable = false)
    private Empresa empresa_user;

/*
    @JsonIgnore
    @OneToMany(mappedBy = "modules")
    private List<Modules> modules = new ArrayList<Modules>();
*/
}
