package com.todo.todoList.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties("todolist")
@Data
public class todoListProperty {

    todoListProperty(){
     setOriginPermitida("http://localhost:4200");
    }

    public String getOriginPermitida() {
        return originPermitida;
    }

    public void setOriginPermitida(String originPermitida) {
        this.originPermitida = originPermitida;
    }

    private String originPermitida = "http://localhost:4200";


}
