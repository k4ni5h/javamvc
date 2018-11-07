package com.auth.account.service;

import com.auth.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
