package com.todo.todoList.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "modules")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Modules {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name",nullable = false)
    private String nome;

    @Column(name="link",nullable = false)
    private String link;

    @Column(name="icon")
    private String icon;

    @Column(name = "active")
    private Boolean active;

    @JsonIgnore
    @OneToMany(mappedBy = "modules" )
    private List<MenuModules> menuModulesList = new ArrayList<MenuModules>();

   //Vínculo

}
