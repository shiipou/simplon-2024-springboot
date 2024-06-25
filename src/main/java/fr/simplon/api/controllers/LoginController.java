package fr.simplon.api.controllers;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.api.models.User;
import fr.simplon.api.repositories.UserRepository;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public Optional<User> createUser(
        @ModelAttribute("username") String username,
        @ModelAttribute("password") String password
    ) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @PostMapping("/register")
    public User createUser(
        @ModelAttribute("username") String username,
        @ModelAttribute("password") String password,
        @ModelAttribute("passwordConfirm") String passwordConfirm,
        @ModelAttribute("email") String email
    ) {
        if (password.equals(passwordConfirm)) {
            User user = new User(username);
            user.setEmail(email);
            user.setPassword(password);
            return userRepository.save(user);
        } else {
            throw new InputMismatchException("Passwords didn't match");
        }
    }

}
