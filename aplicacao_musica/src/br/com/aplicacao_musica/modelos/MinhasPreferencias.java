package br.com.aplicacao_musica.modelos;

import br.com.aplicacao_musica.Audio;

public class MinhasPreferencias {
    public void inlcui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println("Esta música está entre as mais escutadas do país: " + audio.getTitulo());
        } else {
            System.out.println("Está música promete ser uma das melhores do país: " + audio.getTitulo());
        }
    }
}
