package org.regeneration.efkajpa.controller;


import org.regeneration.efkajpa.entity.Users;
import org.regeneration.efkajpa.repository.CitizenRepository;
import org.regeneration.efkajpa.security.ApiUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    private ApiUserDetailsService apiUserDetailsService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user")
    public Users getUsers(@RequestBody String username) {
        /*@RequestParam(value = "username", required = true) String username, @RequestParam(value = "password", required = true) String password) {*/
        return apiUserDetailsService.getUserByUsername(username);
    }

}

