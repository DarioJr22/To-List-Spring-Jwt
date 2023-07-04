package com.todo.todoList.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="menuModules")
@NoArgsConstructor
@AllArgsConstructor
public class MenuModules {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="modules",nullable = false,updatable = false)
    private Modules module;
}
