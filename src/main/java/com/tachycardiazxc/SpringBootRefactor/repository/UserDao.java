package com.tachycardiazxc.SpringBootRefactor.repository;

import com.tachycardiazxc.SpringBootRefactor.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void delete(long id);

    void patch(User user);

    List<User> get();

    User getById(long id);

}
