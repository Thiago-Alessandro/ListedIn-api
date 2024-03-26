package com.listedin.listedinapi.user.model.dto;

import com.listedin.listedinapi.file.model.entity.File;
import com.listedin.listedinapi.list.model.entity.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostUserDTO {

    private String name;
    private String password;
    private String email;

}
