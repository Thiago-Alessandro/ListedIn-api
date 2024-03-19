package com.listedin.listedinapi.user.controller;

import com.listedin.listedinapi.product.model.entity.Product;
import com.listedin.listedinapi.product.service.ProductService;
import com.listedin.listedinapi.user.model.entity.User;
import com.listedin.listedinapi.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User findById(Long id) {
        return userService.findById(id);
    }

    @GetMapping
    public Collection<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public User create(User user) {
        return userService.create(user);
    }

    @PutMapping
    public User update(User user) {
        return userService.update(user);
    }

    @DeleteMapping
    public void delete(Long id) {
        userService.delete(id);
    }

}
