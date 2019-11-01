package com.secg.vet.services;

import com.secg.vet.domain.User;

import java.util.List;

public interface userService {
    public List<User> findAll();
    public User findOne(Integer id);
    public void updateOrCreate(User user);
    public void delete(User user);
}
