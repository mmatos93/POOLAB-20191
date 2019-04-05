package br.edu.ifpb.Pratica2;

import java.util.ArrayList;

public class CatalogoLivro {

    private ArrayList<Livro> catalogo;

    public CatalogoLivro() {
        this.catalogo = new ArrayList<>();
    }

    public int qtdLivros(){
        return catalogo.size();
    }

    public void listarLivros(){
        for(Livro l : catalogo){
            System.out.println(l.getTitulo());
        }
    }

    public boolean cadastrarLivro(Livro l){
        if(catalogo.add(l)) return true;
        else return false;
    }


    public boolean removerporTitulo(String titulo){
        // captura os candidatos à remoção
        ArrayList<Livro> candidatos = new ArrayList<>();
        for(Livro l : catalogo){
            if(titulo.equals(l.getTitulo())) candidatos.add(l);
        }
        // remove de fato os candidatos
        for(Livro candidato : candidatos) {
            return catalogo.remove(candidato);
        }
        return false;
    }
}
