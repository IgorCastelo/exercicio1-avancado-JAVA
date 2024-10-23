package dominio;

import excecoes.ItemNaoDisponivelException;

public class MidiaDigital extends ItemBiblioteca {
    @Override
    void emprestar() throws ItemNaoDisponivelException{
        if (!isDisponivel()){
            throw new ItemNaoDisponivelException("Item não disponível");
        }setDisponivel(false);
        System.out.println("midia  emprestada com sucesso");
    }

    @Override
    void devolver() {
        setDisponivel(true);
        System.out.println("Mídia devolvida com sucesso.");
    }
}
