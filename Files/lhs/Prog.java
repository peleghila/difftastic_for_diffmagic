package com.example.app.service;

import com.example.app.model.User;
import com.example.app.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User getUserById(Long id) {
        Optional<User> u = repo.findById(id);
        if (!u.isPresent()) {
            return null;
        }
        return u.get();
    }

    public boolean updateEmail(Long id, String newEmail) {
        User u = repo.findById(id).orElse(null);
        if (u == null) {
            return false;
        }

        // no validation at all
        u.setEmail(newEmail);
        repo.save(u);
        return true;
    }

    public List<User> getAllUsers() {
        return repo.findAll(); // can return null in older JPA impls
    }
}
