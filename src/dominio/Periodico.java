package dominio;

import excecoes.ItemNaoDisponivelException;
import excecoes.ItemNaoEncontradoException;

public class Periodico extends ItemBiblioteca{
    public Periodico(String titulo, String autor){
        super(titulo,autor);
    }
    @Override
    public void emprestar() throws ItemNaoDisponivelException{
        if (!isDisponivel()){
            throw new ItemNaoDisponivelException("Periódico indisponível");
        }setDisponivel(false);
        System.out.println("Periódico emprestado com sucesso");
    }




@Override
    public void devolver() {
        setDisponivel(true);
            System.out.println("Periódico devolvido com sucesso.");
    }
}
