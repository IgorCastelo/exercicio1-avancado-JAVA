package dominio;

import excecoes.ItemNaoDisponivelException;

public abstract class ItemBiblioteca implements Comparable<ItemBiblioteca> {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String autor) {
        this.titulo=titulo;
        this.autor=autor;
        this.disponivel=true;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemBiblioteca that = (ItemBiblioteca) o;

        if (disponivel != that.disponivel) return false;
        if (!titulo.equals(that.titulo)) return false;
        return autor.equals(that.autor);
    }

    @Override
    public int hashCode() {
        int result = titulo.hashCode();
        result = 31 * result + autor.hashCode();
        result = 31 * result + (disponivel ? 1 : 0);
        return result;
    }

    @Override
    public int compareTo(ItemBiblioteca item) {
        return this.titulo.compareTo(item.getTitulo());
    }

    public void emprestar() throws ItemNaoDisponivelException { }
    public void devolver()throws ItemNaoDisponivelException{}
}
