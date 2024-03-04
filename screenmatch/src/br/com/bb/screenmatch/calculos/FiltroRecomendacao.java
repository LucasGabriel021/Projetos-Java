package br.com.bb.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtrar(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Este filme é muito bom!");
        } else if(classificavel.getClassificacao() >= 2) {
            System.out.println("Este filme pode ser um decepção ou não");
        } else {
            System.out.println("Talvez assistir o filme do Pelé seja melhor!");
        }
    }
}
