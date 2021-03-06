package com.erislandio.cursomc.services;

import com.erislandio.cursomc.domain.Categoria;
import com.erislandio.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> categoria = repo.findById(id);
        return  categoria.orElse(null);
    }
}
