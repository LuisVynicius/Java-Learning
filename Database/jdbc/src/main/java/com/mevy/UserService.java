package com.mevy;

import java.sql.Connection;

public class UserService {

    private UserRepository userRepository;
    
    public UserService(Connection connection) {
        this.userRepository = new UserRepository(connection);
    }

    public User findById(int id) throws Exception {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException(User.class.getSimpleName() + " not found. "));
        return user;
    }

}
