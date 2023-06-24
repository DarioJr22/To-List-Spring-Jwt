package com.todo.todoList.service;

import com.todo.todoList.model.User;
import com.todo.todoList.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class UserServiceImp implements UserService{


    @Autowired UserRepository UserRepo;
    @Override
    public User saveUser(User user) {
        return UserRepo.save(user);
    }

    @Override
    public ArrayList<User> getUser() {
      return (ArrayList<User>) UserRepo.findAll();
    }

    @Override
    public User putUser(User userUp, Long id) {
       User UserOld = UserRepo.findById(id).get();

       if(Objects.nonNull(userUp.getNome())){
           UserOld.setNome(userUp.getNome());
       }
        return UserRepo.save(UserOld);
    }

    @Override
    public String deleteUser(Long id) {
        UserRepo.deleteById(id);
        return "Usuario " + id + " deletado !";
    }
}
