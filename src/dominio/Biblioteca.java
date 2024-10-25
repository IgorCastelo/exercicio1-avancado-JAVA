package dominio;

import excecoes.ItemNaoEncontradoException;
import interfaces.Gerenciavel;

import java.lang.reflect.Array;
import java.util.*;

public class Biblioteca implements Gerenciavel {
    private List<ItemBiblioteca> itens = new LinkedList<>();

    @Override
    public void adicionarItem(ItemBiblioteca item) {
        System.out.println("Item adicionado a biblioteca com sucesso!");
        itens.add(item);
    }

    @Override
    public void removerItem(ItemBiblioteca item) throws ItemNaoEncontradoException {
        Iterator<ItemBiblioteca> itemBibliotecaIterator = itens.iterator();
        while (itemBibliotecaIterator.hasNext()) {
            ItemBiblioteca itemR = itemBibliotecaIterator.next();
            if (itemR.getTitulo().equalsIgnoreCase(item.getTitulo())) {
                System.out.println("Item removido com sucesso!");
                itens.remove(item);
            }
        }
    }

        @Override
        public ItemBiblioteca buscarItem (String titulo) throws ItemNaoEncontradoException {
            Iterator<ItemBiblioteca> itemBibliotecaIterator = itens.iterator();
            while (itemBibliotecaIterator.hasNext()) {
                ItemBiblioteca item = itemBibliotecaIterator.next();
                if (item.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println("Buscando item...");
                    return item;
                }
            }
            throw new ItemNaoEncontradoException("Item não encontrado" + titulo);
        }

    }


