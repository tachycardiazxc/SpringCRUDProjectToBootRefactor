package com.tachycardiazxc.SpringBootRefactor.services;

import com.tachycardiazxc.SpringBootRefactor.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(long id);

    void patch(User user);

    List<User> get();

    User getById(long id);

}
