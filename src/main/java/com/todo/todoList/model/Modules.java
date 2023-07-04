package com.todo.todoList.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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


    @Column(name = "name",unique = true,nullable = false)
    private String nome;

    @Column(name="link",unique = true,nullable = false)
    private String link;

    @Column(name="icon")
    private String icon;

    @Column

   //Vínculo
   @ManyToOne
   @JoinColumn(name = "usuario",nullable = false,updatable = false)
   private User usuario;

}
