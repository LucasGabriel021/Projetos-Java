package br.com.lg.aula_01.exemplo03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MaiorValor implements Callable<Integer> {
    private List<Integer> numeros;
    private int numeroInicial;
    private int numeroFinal;

    public MaiorValor(List<Integer> numeros, int numeroInicial, int numeroFinal) {
        this.numeros = numeros;
        this.numeroInicial = numeroInicial;
        this.numeroFinal = numeroFinal;
    }

    public Integer call() throws Exception {
        return 0;
    }
}
