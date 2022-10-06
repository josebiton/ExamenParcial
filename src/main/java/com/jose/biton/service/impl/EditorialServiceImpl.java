package com.jose.biton.service.impl;

import com.jose.biton.entity.Editorial;
import com.jose.biton.repository.EditorialRepository;
import com.jose.biton.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServiceImpl implements EditorialService {
   @Autowired
   private EditorialRepository editorialRepository;
    @Override
    public List<Editorial> findAll() {
        return (List<Editorial>) editorialRepository.findAll();

    }

    @Override
    public Editorial findById(Long id) {
        return editorialRepository.findById(id).orElse(null);
    }

    @Override
    public Editorial save(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public void delete(Editorial editorial) {
    editorialRepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
    editorialRepository.deleteById(id);
    }
}
