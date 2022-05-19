package com.service;

import com.entity.User;
import java.util.List;

public interface UserService {

    void addUser(String name, String lastName, String email);

    void updateUser(long id, String firstName, String lastName, String email);

    List<User> readUsers();

    void deleteUsersById(long id);
}

