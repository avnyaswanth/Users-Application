package com.users.application.usersjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserMongoRepo userMongoRepo;

    public List<Users> getAllUsers() {
        return userMongoRepo.findAll();
    }

    public Users getUser(UUID id) {
        return userMongoRepo.findById(id).get();
    }

    public Users addUser(@RequestBody Users user) {
        return userMongoRepo.save(user);
    }

    public ResponseEntity<String> validateUserName(@RequestBody Users user) {

        List<Users> users = getAllUsers();

        for(Users curUser : users) {
            if(curUser.getUserName().equals(user.getUserName()))
                return ResponseEntity.badRequest().body("Username Already Taken");
            if(curUser.getEmail().equals(user.getEmail()))
                return ResponseEntity.badRequest().body("Mail Already Taken");
        }

        if(!user.getPassword().equals(user.getConfirmPassword()))
            return ResponseEntity.badRequest().body("Passwords Doesn't match");

        return ResponseEntity.ok("Valid Username and Mail");
    }



    public Users deleteUser(UUID id) {
        Users user = getUser(id);
        userMongoRepo.deleteById(id);
        return user;
    }
}
