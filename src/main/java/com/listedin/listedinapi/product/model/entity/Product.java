package com.listedin.listedinapi.product.model.entity;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.list.model.entity.List;
import com.listedin.listedinapi.productList.model.entity.ProductList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    @ManyToOne
    private Category category;

    //rever
    @OneToMany
    private Collection<ProductList> lists;

}
