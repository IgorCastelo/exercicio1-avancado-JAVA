package dominio;

import excecoes.ItemNaoDisponivelException;
import excecoes.ItemNaoEncontradoException;

public class Periodico extends ItemBiblioteca{
    public Periodico(){
    }

    @Override
    void emprestar() throws ItemNaoDisponivelException {
        if (!isDisponivel()){
            throw new ItemNaoDisponivelException("Item não encontrado");
        }setDisponivel(false);
        System.out.println("Midia emprestada com com sucesso.");
    }

    @Override
    void devolver() {
        setDisponivel(true);
            System.out.println("Periódico devolvido com sucesso.");
    }
}
