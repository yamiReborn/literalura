package com.example.literalurayami.service;

import com.example.literalurayami.model.Autor;
import com.example.literalurayami.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    // Método para buscar autores por ano de falecimento
    public List<Autor> buscarPorAnoFalecimento(int anoFalecimento) {
        return autorRepository.findByAnoFalecimento(anoFalecimento);
    }

    // Método para verificar se o autor estava vivo em determinado ano
    public boolean estaVivoEmAno(Autor autor, int ano) {
        if (autor.getAnoFalecimento() == 0) {
            return true;  // Se o autor não faleceu (anoFalecimento == 0), ele está vivo
        } else {
            return autor.getAnoFalecimento() > ano;  // Se o ano de falecimento for maior que o ano passado, ele estava vivo
        }
    }

    // Método para buscar autor por ID
    public Optional<Autor> buscarPorId(Long id) {
        return autorRepository.findById(id); // Retorna o autor encontrado ou um Optional vazio
    }

    // Método para buscar autor por nome
    public List<Autor> buscarPorNome(String nome) {
        return autorRepository.findByNomeContainingIgnoreCase(nome);
    }
}
