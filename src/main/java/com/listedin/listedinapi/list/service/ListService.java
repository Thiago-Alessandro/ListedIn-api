package com.listedin.listedinapi.list.service;

import com.listedin.listedinapi.list.model.entity.List;
import com.listedin.listedinapi.list.repository.ListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ListService {

    private final ListRepository listRepository;

    public List findById(Long id) {
        return listRepository.findById(id).get();
    }

    public Collection<List> findAll() {
        return listRepository.findAll();
    }

    public List create(List list) {
        return listRepository.save(list);
    }

    public List update(List list) {
        return listRepository.save(list);
    }

    public void delete(Long id) {
        listRepository.deleteById(id);
    }

}
