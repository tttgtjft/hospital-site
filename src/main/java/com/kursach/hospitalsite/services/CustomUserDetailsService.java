package com.kursach.hospitalsite.services;

import com.kursach.hospitalsite.entities.UserData;
import com.kursach.hospitalsite.repository.UserDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserDataRepository userDataRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        if (login != null) {
            return userDataRepository.findByLogin(login);
        }
        throw new UsernameNotFoundException("User not found");
    }

}
