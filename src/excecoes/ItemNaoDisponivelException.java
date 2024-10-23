package excecoes;
public class ItemNaoDisponivelException extends Exception {
    public ItemNaoDisponivelException(String message) {
        super("Item não disponível");
    }
}

