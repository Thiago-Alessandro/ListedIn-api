package com.listedin.listedinapi.product.service;

import com.listedin.listedinapi.product.model.entity.Product;
import com.listedin.listedinapi.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    public Collection<Product> findAll() {
        return productRepository.findAll();
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
