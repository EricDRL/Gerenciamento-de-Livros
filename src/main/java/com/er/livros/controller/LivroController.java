package com.er.livros.controller;

import com.er.livros.entity.LivroModel;
import com.er.livros.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/livros")


public class LivroController {

    @Autowired
    private LivroService livroService;


    @GetMapping
    public List<LivroModel> buscarTodos(){
        return livroService.buscarTodos();
    }


    @GetMapping("/{id}")
    public Optional<LivroModel> buscarPorId(@PathVariable Long id){
        return livroService.buscarPorId(id);
    }

    @PostMapping
    public LivroModel criarlivro(@RequestBody LivroModel livroModel){
        return livroService.criarLivro(livroModel);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id){
        livroService.deletarLivro(id);
    }


}
