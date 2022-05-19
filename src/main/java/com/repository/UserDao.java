package com.repository;

import com.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(String name, String lastName, String email);

    void updateUser(User user);


    List<User> readUsers();


    void deleteUsersById(long id);
}
