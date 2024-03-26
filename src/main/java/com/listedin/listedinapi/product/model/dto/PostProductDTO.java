package com.listedin.listedinapi.product.model.dto;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.productList.model.entity.ProductList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostProductDTO {

    private String name;
    private Double price;
    private Category category;
    private Collection<ProductList> lists;

}
