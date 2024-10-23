package excecoes;
public class ItemNaoEncontradoException extends Exception {
    public ItemNaoEncontradoException(String message) {
        super("Item Nao encontrado");
    }
}
