package edu.controller;


import edu.model.User;
import edu.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {


    @Autowired
    final IUserService iUserService;

    @GetMapping("/getAll")
    public List<User> getUser() {
        return iUserService.getAll();
    }

    @PostMapping("/addUser")
    @ResponseStatus(HttpStatus.CREATED)
    public void  addUser(@RequestBody User user) {
        iUserService.addUser(user);
    }

    @GetMapping("/searchById/{id}")
    public User getUserById(@PathVariable Integer id){
        return iUserService.searchUserById(id);
    }

    @DeleteMapping("/deleteUserById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUserById(@PathVariable Integer id){
        iUserService.deleteUserById(id);
    }

    @PutMapping("/updateUser")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateUser(@RequestBody User user){
        iUserService.updateUserById(user);
    }

}
