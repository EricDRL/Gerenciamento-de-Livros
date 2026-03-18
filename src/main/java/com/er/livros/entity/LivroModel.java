package com.er.livros.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_livro")
public class LivroModel {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_livro")
    private Long id;

    @Column(name = "titulo_livro")
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public LivroModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
