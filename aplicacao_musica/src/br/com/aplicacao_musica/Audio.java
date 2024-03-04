package br.com.aplicacao_musica;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void exibirInfos() {
        System.out.println("Informações...");
    }

}
