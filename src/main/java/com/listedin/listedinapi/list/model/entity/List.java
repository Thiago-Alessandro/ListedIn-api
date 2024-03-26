package com.listedin.listedinapi.list.model.entity;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.product.model.entity.Product;
import com.listedin.listedinapi.productList.model.entity.ProductList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class List {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private Collection<ProductList> products;
    @ManyToMany
    private Collection<Category> categories;
    private Boolean isFavorited;
    private LocalDateTime lastAccess;
}
