package com.todo.todoList.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@Table(name="menuModules")
@NoArgsConstructor
@AllArgsConstructor
public class MenuModules {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome",nullable = false)
    private String nome;

    @Column(name="link")
    private String link;

    @ManyToOne
    @JoinColumn(name ="modules",nullable = false,updatable = false)
    private Modules modules;
}
