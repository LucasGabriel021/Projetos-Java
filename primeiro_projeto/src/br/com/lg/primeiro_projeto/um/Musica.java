package br.com.lg.primeiro_projeto.um;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacao;

    void exibirFichaTecnica() {
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
        System.out.println(numAvaliacao);
    }

    void avaliar(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacao;
    }
}
