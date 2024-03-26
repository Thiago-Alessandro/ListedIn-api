package com.listedin.listedinapi.productList.model.entity;

import com.listedin.listedinapi.list.model.entity.List;
import com.listedin.listedinapi.product.model.entity.Product;
import com.listedin.listedinapi.productList.model.id.ProductListId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ProductListId.class)
public class ProductList {

    @Id
    private Long productId;
    @Id
    private Long listId;

    @ManyToOne
    private Product product;
    @ManyToOne
    private List list;

    private Double quantity;
    private Double price;

}
