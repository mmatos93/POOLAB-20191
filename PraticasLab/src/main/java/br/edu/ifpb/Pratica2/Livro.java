package br.edu.ifpb.Pratica2;

public class Livro {

    private int qtdPaginas;
    private int anoPublicacao;
    private String autor;
    private String titulo;
    private String genero;

    public Livro() {
        this.qtdPaginas = 0;
        this.anoPublicacao = 0;
        this.autor = "Autor Desconhecido";
        this.titulo = "Este é um livro padrão";
        this.genero = "Padrão";
    }

    public Livro(int qtdPaginas, int anoPublicacao, String autor, String titulo, String genero) {
        this.qtdPaginas = qtdPaginas;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }
}
