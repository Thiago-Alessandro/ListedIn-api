package com.listedin.listedinapi.product.model.dto;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.product.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShortProductDTO {

    private Long id;
    private String name;
    private Double price;
    private Category category;

    public ShortProductDTO(Product product){
        BeanUtils.copyProperties(product, this);
    }

}
