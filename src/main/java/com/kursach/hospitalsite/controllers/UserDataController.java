package com.kursach.hospitalsite.controllers;

import com.kursach.hospitalsite.entities.UserData;
import com.kursach.hospitalsite.repository.UserDataRepository;
import com.kursach.hospitalsite.services.UserDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserDataController {

    private final UserDataService userDataService;
    private final UserDataRepository userDataRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUserData(UserData userData) {
        if (userDataRepository.findByLogin(userData.getLogin()) == null) {
            return "login";
        }
        return "redirect:/";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String createUserData(UserData userData, Model model)
    {
        if (!userDataService.createUser(userData)) {
            model.addAttribute("errorMessage", "Логин " + userData.getLogin() + "уже занят");
            return "registration";
        }
        return "redirect:/login";
    }

    @GetMapping("/")
    public String securityTest() {
        return "hello";
    }

}
