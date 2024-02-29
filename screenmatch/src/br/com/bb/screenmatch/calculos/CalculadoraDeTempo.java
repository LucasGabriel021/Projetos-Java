package br.com.bb.screenmatch.calculos;

import br.com.bb.screenmatch.modelos.Filme;
import br.com.bb.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void incluir(Titulo titulo) {
        System.out.println("Titulo" + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
