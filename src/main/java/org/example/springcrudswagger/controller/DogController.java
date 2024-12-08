package org.example.springcrudswagger.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.springcrudswagger.model.entity.Dog;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dog")
@Tag(name = "DOG CONTROLLER", description = "this class for dog crud operations")
public class DogController {

    @PostMapping
    @Operation(description = "DOG save method")
    public Dog save(@RequestBody Dog dog) {
        return null;
    }
}
