package com.example.spring_security.service;

import com.example.spring_security.entity.Users;
import com.example.spring_security.model.UsersDetails;
import com.example.spring_security.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> user = usersRepository.findByUserName(username);
        user.orElseThrow(() -> new UsernameNotFoundException("user not found - "+username));
        return new UsersDetails(user.get());
    }
}
