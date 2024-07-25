package me.com.bank.controller;

import me.com.bank.domain.model.User;
import me.com.bank.domain.model.dto.UserResponseDto;
import me.com.bank.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static me.com.bank.domain.model.User.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable Long userId) {
        var user = userService.findById(userId);
        return ResponseEntity.ok(toUserResponseDto(user));
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> create(@RequestBody User user) {
        var createdUser = userService.create(user);
        URI location = UriComponentsBuilder.fromPath("/{id}").buildAndExpand(createdUser.getId())
                .toUri();
        return ResponseEntity.created(location).body(toUserResponseDto(createdUser));
    }
}
