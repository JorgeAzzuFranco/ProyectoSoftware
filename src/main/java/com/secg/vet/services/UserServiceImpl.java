package com.secg.vet.services;

import com.secg.vet.domain.User;
import com.secg.vet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOneByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public void updateOrCreate(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public boolean userExists(User user) {
        if(userRepository.userExists(user.getUsername()) != null){
            return true;
        }else {
            return false;
        }
    }
}
