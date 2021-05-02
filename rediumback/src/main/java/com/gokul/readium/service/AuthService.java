package com.gokul.readium.service;


import com.gokul.readium.dto.RegisterRequest;
import com.gokul.readium.model.User;
import com.gokul.readium.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public void signUp(RegisterRequest registerRequest){

        User user=new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(encodePassword(registerRequest.getPassword()));


    }

    private String encodePassword(String password){
        return passwordEncoder.encode(password);
    }
}
