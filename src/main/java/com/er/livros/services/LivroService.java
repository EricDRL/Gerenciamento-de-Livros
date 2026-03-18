package com.vitorferreira.gerenciamento_Livros.Service;

import com.er.livros.models.LivroModel;
import com.er.livros.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LivroService {


    @Autowired
    private LivroRepository livroRepository;

    public List<LivroModel> buscarTodos(){
        return livroRepository.findAll();
    }

    public void  deletarLivro(Long id){
        livroRepository.deleteById(id);
    }

    public LivroModel criarLivro(LivroModel livroModel){
        return livroRepository.save(livroModel);
    }

    public Optional<LivroModel> buscarPorId(Long id){
        return livroRepository.findById(id);
    }
}
