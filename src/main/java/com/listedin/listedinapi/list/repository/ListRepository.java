package com.listedin.listedinapi.list.repository;

import com.listedin.listedinapi.list.model.entity.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ListRepository extends JpaRepository<List, Long> {
}
