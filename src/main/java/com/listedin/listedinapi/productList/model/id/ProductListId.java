package com.listedin.listedinapi.productList.model.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductListId implements Serializable {

    private Long productId;
    private Long listId;

}
