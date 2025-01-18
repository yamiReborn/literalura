package com.example.literalurayami.service;

import com.example.literalurayami.model.Livro;
import com.example.literalurayami.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> buscarPorTitulo(String titulo) {
        return livroRepository.findByTituloContainingIgnoreCase(titulo);
    }

    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    // Outros métodos de negócio podem ser adicionados aqui
}
