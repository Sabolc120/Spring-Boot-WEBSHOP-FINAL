package com.elsoprojekt.webProjekt.Controller.Service.impl;

import com.elsoprojekt.webProjekt.Controller.Service.UserService;
import com.elsoprojekt.webProjekt.Model.User;
import com.elsoprojekt.webProjekt.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public User addUser(User user) {
        // We're going to save our user to the database.
        return userDao.save(user);
    }

    @Override
    public User getUser(String username, String password) {
        return userDao.findUserByCredentials(username, password);
    }
}
