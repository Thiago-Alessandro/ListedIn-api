package com.listedin.listedinapi.user.model.entity;

import com.listedin.listedinapi.file.model.entity.File;
import com.listedin.listedinapi.list.model.entity.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private File image;
    @OneToMany
    private Collection<List> lists;
    @OneToMany
    private Collection<List> createdProducts;
    private Boolean isDark = false;
    private Boolean isNotificationsActive = true;

}
