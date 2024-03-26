package com.listedin.listedinapi.list.model.dto;

import com.listedin.listedinapi.category.model.entity.Category;
import com.listedin.listedinapi.list.model.entity.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShortListDTO {

    private Long id;
    private String name;
    private Collection<Category> categories;
    private Boolean isFavorited;
    private LocalDateTime lastAccess;

    public ShortListDTO(List list){
        BeanUtils.copyProperties(list, this);
    }

}
