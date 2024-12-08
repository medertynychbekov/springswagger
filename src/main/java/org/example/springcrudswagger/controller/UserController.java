package org.example.springcrudswagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.springcrudswagger.model.entity.User;
import org.example.springcrudswagger.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Tag(name = "USER CONTROLLER", description = "this class for user crud operations")
public class UserController {

    private final UserService userService;

    @PostMapping
    @Operation(description = "this save method should to use save user object")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    @Operation(description = "THIS IS FIND_BY_ID METHOD")
    public User findById(@PathVariable(required = false) Long id){
        return userService.findById(id);
    }

    @GetMapping
    @Operation(description = "THIS IS FIND_ALL METHOD")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PutMapping("/{id}")
    @Operation(description = "THIS IS UPDATE METHOD")
    public User updateById(@PathVariable Long id, @RequestBody User user){
        return userService.updateById(id, user);
    }

    @DeleteMapping("/{id}")
    @Operation(description = "THIS IS DELETE METHOD")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }
}
