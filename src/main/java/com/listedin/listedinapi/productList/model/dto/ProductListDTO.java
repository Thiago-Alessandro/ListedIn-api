package com.listedin.listedinapi.productList.model.dto;

import com.listedin.listedinapi.list.model.dto.ShortListDTO;
import com.listedin.listedinapi.product.model.dto.ShortProductDTO;
import com.listedin.listedinapi.productList.model.entity.ProductList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductListDTO {

    private Long productId;
    private Long listId;
    private ShortProductDTO product;
    private ShortListDTO list;
    private Double quantity;
    private Double price;

    public ProductListDTO(ProductList productList){
        BeanUtils.copyProperties(productList, this);
        this.list = new ShortListDTO(productList.getList());
        this.product = new ShortProductDTO(productList.getProduct());
    }

}
