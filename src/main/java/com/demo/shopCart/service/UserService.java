package com.demo.shopCart.service;

import com.demo.shopCart.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> findAllUsers();

    void addUser(User user);

    User findById(int id);

    void deleteUser(int idd);

    UserDetails loadUserByUsername(String username);
}
