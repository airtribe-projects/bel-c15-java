package org.example.service;

import org.example.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {
    private final Map<Long, User> users = new HashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    public UserService() {
        // Initialize with some sample data
        createUser(new User(null, "John Doe", "john.doe@example.com", 25));
        createUser(new User(null, "Jane Smith", "jane.smith@example.com", 30));
        createUser(new User(null, "Bob Johnson", "bob.johnson@example.com", 35));
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUserById(Long id) {
        return users.get(id);
    }

    public User createUser(User user) {
        Long id = counter.getAndIncrement();
        user.setId(id);
        users.put(id, user);
        return user;
    }

    public User updateUser(Long id, User updatedUser) {
        if (users.containsKey(id)) {
            updatedUser.setId(id);
            users.put(id, updatedUser);
            return updatedUser;
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        return users.remove(id) != null;
    }

    public List<User> searchUsersByName(String name) {
        return users.values().stream()
                .filter(user -> user.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }
}