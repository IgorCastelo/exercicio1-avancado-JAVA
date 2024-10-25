package teste;

import dominio.*;
import excecoes.ItemNaoDisponivelException;
import excecoes.ItemNaoEncontradoException;

import java.util.List;

public class SistemaGerenciamentoBibliotecaTest01 {
    public static void main(String[] args) {

        Biblioteca  biblioteca = new Biblioteca();
        biblioteca.adicionarItem(new Livro("biblia", "desconhecido"));
        biblioteca.adicionarItem(new Periodico("Rock Animal", "Recreio"));
        biblioteca.adicionarItem(new MidiaDigital("O Programador Pragmático", " Andrew Hunt, David Thomas"));


        try {
            ItemBiblioteca item = biblioteca.buscarItem("Rock Animal");
            item.emprestar();
            item.devolver();
            biblioteca.removerItem(item);
            biblioteca.adicionarItem(new Livro("O limite a da ética", "Emannuel Kant"));
            System.out.println(biblioteca.buscarItem("O limite a da ética"));




        } catch (ItemNaoEncontradoException | ItemNaoDisponivelException e){
            e.printStackTrace();
        }
    }
}


