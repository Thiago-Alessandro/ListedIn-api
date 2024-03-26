package com.listedin.listedinapi.list.model.dto;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.productList.model.entity.ProductList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PutListDTO {

    private Long id;
    private String name;
    private Collection<ProductList> products;
    private Collection<Category> categories;
    private Boolean isFavorited;

}
