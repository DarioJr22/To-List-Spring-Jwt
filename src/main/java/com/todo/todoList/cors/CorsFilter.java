package com.todo.todoList.cors;

import com.todo.todoList.config.todoListProperty;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;


@Component
@Data
@Order(Ordered.HIGHEST_PRECEDENCE)

//Interceptador de pré requisição, configuração do CORS (Revisar)
public class CorsFilter implements Filter {
    @Autowired
    private todoListProperty todoListProperty;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }


    //Configuração do filtro de controle de acesso para cada tipo de requisição

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        response.setHeader("Access-Control-Allow-Origin",todoListProperty.getOriginPermitida());
        response.setHeader("Access-Control-Allow-Credentials","true");

        if("OPTIONS".equals(request.getMethod()) && todoListProperty.getOriginPermitida().equals(request.getHeader("Origin"))){
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
            response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(req,resp);
        }

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
