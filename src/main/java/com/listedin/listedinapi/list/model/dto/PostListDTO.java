package com.listedin.listedinapi.list.model.dto;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.productList.model.entity.ProductList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostListDTO {

    private String name;
    private Collection<ProductList> products;
    private Collection<Category> categories;
    private Boolean isFavorited;

}
