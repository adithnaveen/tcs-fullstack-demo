package com.training.rest_services.repo;

import com.training.rest_services.entity.User;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {

    private Map<Long, User> userStore = new HashMap<>();
    private AtomicLong counter = new AtomicLong();

    public User save(User user) {
        long id = counter.incrementAndGet();
        userStore.put(id, user);
        return user;
    }

    public User findById(long id) {
        return userStore.get(id);
    }
}