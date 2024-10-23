package interfaces;

import dominio.ItemBiblioteca;
import excecoes.ItemNaoEncontradoException;

public interface Gerenciavel  {
    void adicionarItem(ItemBiblioteca item );
    void removerItem(ItemBiblioteca item) throws ItemNaoEncontradoException;
    ItemBiblioteca buscarItem(String titulo)throws ItemNaoEncontradoException;

}
