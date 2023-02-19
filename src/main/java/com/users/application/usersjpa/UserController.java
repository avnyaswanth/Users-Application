package com.users.application.usersjpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
//@ApiOperation("User API")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/adduser")
    public Users addUser(@RequestBody Users user) {
        return userService.addUser(user);
    }

    @GetMapping("/getUser/{id}")
    public Users getUser(@PathVariable UUID id) {
        return userService.getUser(id);
    }

    @PutMapping("/updateuser")
    public Users updateUser(@RequestBody Users user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public Users deleteUser(@PathVariable UUID id) {
        return userService.deleteUser(id);
    }

    @PostMapping("/validate-user")
    public ResponseEntity<String> validateUserName(@RequestBody Users user) {
        return userService.validateUserName(user);
    }
}
