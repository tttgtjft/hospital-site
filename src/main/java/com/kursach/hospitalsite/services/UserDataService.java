package com.kursach.hospitalsite.services;

import com.kursach.hospitalsite.entities.UserData;
import com.kursach.hospitalsite.entities.enums.Role;
import com.kursach.hospitalsite.repository.UserDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserDataService {

    private final UserDataRepository userDataRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean createUser(UserData userData) {
        String login = userData.getLogin();
        if (userDataRepository.findByLogin(login) != null) {
            return false;
        }
        userData.setPassword(passwordEncoder.encode(userData.getPassword()));
        userData.getRoles().add(Role.ROLE_USER);
        log.info("Saving new User with login: {}", login);
        userDataRepository.save(userData);
        return true;
    }

}
