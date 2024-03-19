package com.listedin.listedinapi.product.repository;

import com.listedin.listedinapi.list.model.entity.List;
import com.listedin.listedinapi.product.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
