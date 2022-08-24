package com.tachycardiazxc.SpringBootRefactor.services;

import com.tachycardiazxc.SpringBootRefactor.model.User;
import com.tachycardiazxc.SpringBootRefactor.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }

    @Override
    public void patch(User user) {
        userDao.patch(user);
    }

    @Override
    public List<User> get() {
        return userDao.get();
    }

    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }
}
