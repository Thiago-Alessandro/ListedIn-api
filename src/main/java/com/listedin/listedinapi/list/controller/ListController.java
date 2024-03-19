package com.listedin.listedinapi.list.controller;

import com.listedin.listedinapi.list.model.entity.List;
import com.listedin.listedinapi.list.repository.ListRepository;
import com.listedin.listedinapi.list.service.ListService;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/list")
public class ListController {

    private final ListService listService;

    @GetMapping("/{id}")
    public List findById(Long id) {
        return listService.findById(id);
    }

    @GetMapping
    public Collection<List> findAll() {
        return listService.findAll();
    }

    @PostMapping
    public List create(List list) {
        return listService.create(list);
    }

    @PutMapping
    public List update(List list) {
        return listService.update(list);
    }

    @DeleteMapping
    public void delete(Long id) {
        listService.delete(id);
    }

}
