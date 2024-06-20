package catalogo_de_livros;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","autor 1", 1920);
        catalogoLivros.adicionarLivro("Livro 2","autor 2", 1920);
        catalogoLivros.adicionarLivro("Livro 3","autor 3", 1920);
        catalogoLivros.adicionarLivro("Livro 4","autor 4", 1920);
        catalogoLivros.adicionarLivro("Livro 5","autor 5", 1920);
        catalogoLivros.adicionarLivro("Melhor livro do mundo","Lara P Barbosa", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Lara P Barbosa"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2023, 2025));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Melhor Livro do mundo"));

    }

}
