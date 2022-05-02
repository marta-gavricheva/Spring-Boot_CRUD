package com.example.springBootdemo2.service;

import com.example.springBootdemo2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    User getUserId(long id);

    User removeUser(long id);

}
