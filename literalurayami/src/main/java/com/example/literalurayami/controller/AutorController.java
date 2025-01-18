package com.example.literalurayami.controller;

import com.example.literalurayami.model.Autor;
import com.example.literalurayami.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    // Endpoint para buscar autores por nome
    @GetMapping("/buscar-por-nome")
    public List<Autor> getAutoresPorNome(@RequestParam String nome) {
        return autorRepository.findByNomeContainingIgnoreCase(nome);
    }

    // Endpoint para buscar autores pelo ano de nascimento
    @GetMapping("/buscar-por-ano-nascimento")
    public List<Autor> getAutoresPorAnoNascimento(@RequestParam int anoNascimento) {
        return autorRepository.findByAnoNascimento(anoNascimento);
    }

    // Endpoint para buscar autores pelo ano de falecimento
    @GetMapping("/buscar-por-ano-falecimento")
    public List<Autor> getAutoresPorAnoFalecimento(@RequestParam int anoFalecimento) {
        return autorRepository.findByAnoFalecimento(anoFalecimento);
    }
}
