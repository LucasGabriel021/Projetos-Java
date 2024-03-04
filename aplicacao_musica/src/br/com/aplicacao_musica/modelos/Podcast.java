package br.com.aplicacao_musica.modelos;

import br.com.aplicacao_musica.Audio;

public class Podcast extends Audio {
    private String descricao;
    private String particpante;

    public String getParticpante() {
        return particpante;
    }

    public void setParticpante(String particpante) {
        this.particpante = particpante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibirInfos() {
        System.out.println("Informações: ");
        System.out.println("Nome: " + getTitulo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Descrição do Podcast: " + this.descricao);
        System.out.println("Particpante(s): " + getParticpante());
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
