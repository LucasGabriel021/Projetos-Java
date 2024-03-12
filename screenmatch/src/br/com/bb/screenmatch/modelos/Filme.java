package br.com.bb.screenmatch.modelos;

import br.com.bb.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretorFilme;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }

    public String getDiretorFilme() {
        return diretorFilme;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMedia() / 2;
    }

    @Override
    public String toString() {
        return "Nome do filme: " + this.getNome();
    }
}
