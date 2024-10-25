package dominio;

import excecoes.ItemNaoDisponivelException;

public class MidiaDigital extends ItemBiblioteca {
    public MidiaDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void emprestar() throws ItemNaoDisponivelException{
        if (!isDisponivel()){
            throw new ItemNaoDisponivelException("Mídia digital indisponível");
        }setDisponivel(false);
        System.out.println("Mídia digital emprestada com sucesso");
    }

    @Override
    public void devolver() {
        setDisponivel(true);
        System.out.println("Midia devolvida com sucesso.");
    }
}

