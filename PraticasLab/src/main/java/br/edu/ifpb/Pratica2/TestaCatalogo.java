package br.edu.ifpb.Pratica2;

public class TestaCatalogo {
    public static void main(String[] args) {

        CatalogoLivro catalogo = new CatalogoLivro();
        Livro l1 = new Livro(368, 1881, "Machado de Assis", "Memorias postumas de Brás Cubas", "Romance");
        Livro l2 = new Livro(240, 1928, "Mário de Andrade", "Macunaíma", "Romance");
        Livro l3 = new Livro(264, 1888, "Raul Pompeia", "O Ateneu", "Romance");

        catalogo.cadastrarLivro(l1);
        catalogo.cadastrarLivro(l2);
        catalogo.cadastrarLivro(l3);

        catalogo.listarLivros();
        System.out.println(catalogo.qtdLivros());

        catalogo.removerporTitulo("O Ateneu");
        catalogo.listarLivros();
        System.out.println(catalogo.qtdLivros());


    }
}