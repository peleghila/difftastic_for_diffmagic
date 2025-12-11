package com.example.app.service;

import com.example.app.model.User;
import com.example.app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User getUserById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + id));
    }

    public boolean updateEmail(Long id, String newEmail) {
        if (newEmail == null || !newEmail.contains("@")) {
            throw new IllegalArgumentException("Invalid email: " + newEmail);
        }

        return repo.findById(id).map(u -> {
            u.setEmail(newEmail);
            repo.save(u);
            return true;
        }).orElse(false);
    }

    public List<User> getAllUsers() {
        List<User> result = repo.findAll();
        return result != null ? result : Collections.emptyList();
    }
}
