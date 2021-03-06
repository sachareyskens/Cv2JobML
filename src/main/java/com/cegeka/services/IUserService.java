package com.cegeka.services;

import com.cegeka.entities.User;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.List;

@Configurable
public interface IUserService {
    User getUser(String id);
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void delete(String id);
    void changeStatusUser(String id);
}
