package dominio;

import excecoes.ItemNaoEncontradoException;
import interfaces.Gerenciavel;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Gerenciavel {
    private List<ItemBiblioteca> itens = new ArrayList<>();

    @Override
    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
    }

    @Override
    public void removerItem(ItemBiblioteca item) throws ItemNaoEncontradoException {
        if (!itens.remove(item)) {
            throw new ItemNaoEncontradoException("Item não encontrado.");
        }
    }


    @Override
    public ItemBiblioteca buscarItem(String titulo) throws  ItemNaoEncontradoException {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
            throw new ItemNaoEncontradoException("Item não encontrado"+ titulo);
        }
    }



