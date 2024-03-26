package com.listedin.listedinapi.product.model.dto;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.product.model.entity.Product;
import com.listedin.listedinapi.productList.model.dto.ProductListDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProductDTO {

    private Long id;
    private String name;
    private Double price;
    private Category category;
    private Collection<ProductListDTO> lists;

    public GetProductDTO(Product product){
        BeanUtils.copyProperties(product, this);
        this.lists = product.getLists().stream().map(ProductListDTO::new).toList();
    }

}
