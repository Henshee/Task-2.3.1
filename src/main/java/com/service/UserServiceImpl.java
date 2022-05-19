package com.service;

import com.entity.User;
import com.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void addUser(String firstName, String lastName, String email) {
        userDao.addUser(firstName, lastName, email);
    }


    @Override
    public void updateUser(long id, String firstName, String lastName, String email) {
        userDao.updateUser(new User(id, firstName, lastName, email));
    }


    @Override
    public List<User> readUsers() {
        return userDao.readUsers();
    }


    @Override
    public void deleteUsersById(long id) {
        userDao.deleteUsersById(id);
    }
}
