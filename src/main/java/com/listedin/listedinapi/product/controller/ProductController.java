package com.listedin.listedinapi.product.controller;


import com.listedin.listedinapi.list.model.entity.List;
import com.listedin.listedinapi.list.service.ListService;
import com.listedin.listedinapi.product.model.entity.Product;
import com.listedin.listedinapi.product.repository.ProductRepository;
import com.listedin.listedinapi.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{id}")
    public Product findById(Long id) {
        return productService.findById(id);
    }

    @GetMapping
    public Collection<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public Product create(Product product) {
        return productService.create(product);
    }

    @PutMapping
    public Product update(Product product) {
        return productService.update(product);
    }

    @DeleteMapping
    public void delete(Long id) {
        productService.delete(id);
    }

}
