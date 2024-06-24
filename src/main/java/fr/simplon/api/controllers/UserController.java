package fr.simplon.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.api.models.User;
import fr.simplon.api.repositories.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{username}")
    public String helloUser(@PathVariable String username) {
        return "Hello, " + username + " !";
    }

    @PostMapping("/user")
    public User createUser(@ModelAttribute User user) {
        User newUser = new User(user.getUsername());
        return userRepository.save(newUser);
    }

}
