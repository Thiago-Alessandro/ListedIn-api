package com.listedin.listedinapi.user.model.dto;

import com.listedin.listedinapi.file.model.entity.File;
import com.listedin.listedinapi.list.model.entity.List;
import com.listedin.listedinapi.product.model.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserDTO {

    private Long id;
    private String name;
    private String email;
    private File image;
    @OneToMany
    private Collection<List> lists;
    @OneToMany
    private Collection<Product> createdProducts;
    private Boolean isDark = false;
    private Boolean isNotificationsActive = true;

}
