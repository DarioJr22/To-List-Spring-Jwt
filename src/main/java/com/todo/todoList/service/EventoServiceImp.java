package com.todo.todoList.service;

import com.todo.todoList.model.Evento;
import com.todo.todoList.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class EventoServiceImp {

    @Autowired
    EventoRepository repository;


    public Evento[] createEvento(Evento[] e ){
        Evento[] eventos = new Evento[1];

        for (Evento evento : e) {
            repository.save(evento);

        }

        return e;
    };

    public Evento[] update(Evento[] e){
        Evento[] eventos = new Evento[0];
        for (Evento evento : e) {
            repository.save(evento);

            if(eventos.length > 0){
                eventos[eventos.length+1] = evento;
            }else{
                eventos[eventos.length] = evento;
            }

        }

        return eventos;
    };

    public void delete(Long id){
        repository.deleteById(id);
    };

    public ArrayList<Evento> get(){
        return (ArrayList<Evento>) repository.findAll();
    }


}
