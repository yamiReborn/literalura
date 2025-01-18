package com.example.literalurayami.repository;

import com.example.literalurayami.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findByNomeContainingIgnoreCase(String nome);
    List<Autor> findByAnoNascimento(int anoNascimento);
    List<Autor> findByAnoFalecimento(int anoFalecimento);
}
