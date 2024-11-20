package edu.service;

import edu.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    void addUser(User user);
    void deleteUserById(Integer id);
    User searchUserById(Integer id);
    void updateUserById(User user);
}
