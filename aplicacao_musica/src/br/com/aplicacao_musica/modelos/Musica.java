package br.com.aplicacao_musica.modelos;

import br.com.aplicacao_musica.Audio;

public class Musica extends Audio {
    private String nomeBanda;
    private String album;

    public String getNomeBanda() {
        return nomeBanda;
    }

    public void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void exibirInfos() {
        System.out.println("Informações: ");
        System.out.println("Nome da música: " + getTitulo());
        System.out.println("Nome da banda: " + this.nomeBanda);
        System.out.println("Album ao qual a música pertence: " + this.album);
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());

    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
