package com.secg.vet.services;

import com.secg.vet.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findOneByUsername(String username);
    public void updateOrCreate(User user);
    public void delete(User user);
    public boolean userExists(User user);
}
