package br.com.lg.primeiro_projeto.dois;

public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes() {
        System.out.println("Informações do livro:");
        System.out.println(String.format("Título: %s", titulo));
        System.out.println(String.format("Autor do livro: %s", autor));
    }
}
