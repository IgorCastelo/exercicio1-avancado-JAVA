package dominio;

import excecoes.ItemNaoDisponivelException;

public class Livro extends ItemBiblioteca {
    public Livro() {
    }

    @Override
    void emprestar() throws ItemNaoDisponivelException {
    if (!isDisponivel()){
        throw new ItemNaoDisponivelException("Livro não disponível!");
    }setDisponivel(false);
        System.out.println("Livro emprestado com sucesso");
    }

    @Override
    void devolver() {
            setDisponivel(true);
        System.out.println("Livro devolvido com sucesso");
        }
    }

