package com.project.fitness.service;

import com.project.fitness.dto.RequestRegister;
import com.project.fitness.dto.UserResponse;
import com.project.fitness.model.User;
import com.project.fitness.repository.UserRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;



    public UserResponse register(RequestRegister requestRegister) {

        User user = User.builder()
                .email(requestRegister.getEmail())
                .password(requestRegister.getPassword())
                .firstName(requestRegister.getFirstName())
                .lastName(requestRegister.getLastName())
                .build();
//        User user = new User(
//                null,
//                requestRegister.getEmail(),
//                requestRegister.getPassword(),
//                requestRegister.getFirstName(),
//                requestRegister.getLastName(),
//                Instant.parse("2026-08-08T09:22:17.850Z")
//                        .atZone(ZoneOffset.UTC)
//                        .toLocalDateTime(),
//                Instant.parse("2026-08-08T09:22:17.850Z")
//                        .atZone(ZoneOffset.UTC)
//                        .toLocalDateTime(),
//                List.of(),
//                List.of()
//        );
        User savedUser = userRepository.save(user);
        return mapToResponse(savedUser);
    }

    private UserResponse mapToResponse(User savedUser) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setFirstName(savedUser.getFirstName());
        userResponse.setLastName(savedUser.getLastName());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());
        return userResponse;
    }
}
