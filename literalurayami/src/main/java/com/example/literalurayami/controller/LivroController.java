package com.example.literalurayami.controller;

import com.example.literalurayami.model.Livro;
import com.example.literalurayami.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/titulo/{titulo}")
    public List<Livro> buscarPorTitulo(@PathVariable String titulo) {
        return livroService.buscarPorTitulo(titulo);
    }

    @GetMapping
    public List<Livro> listarTodos() {
        return livroService.listarTodos();
    }
}
