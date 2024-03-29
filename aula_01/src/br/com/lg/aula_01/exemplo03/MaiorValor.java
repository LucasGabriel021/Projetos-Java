package br.com.lg.aula_01.exemplo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class MaiorValor implements Callable<Integer> {
    private Integer[] numeros;
    private int numeroInicial;
    private int numeroFinal;

    public MaiorValor(Integer[] numeros, int numeroInicial, int numeroFinal) {
        this.numeros = numeros;
        this.numeroInicial = numeroInicial;
        this.numeroFinal = numeroFinal;
    }

    public Integer call() {
        return Arrays.stream(numeros, numeroInicial, numeroFinal)
                .max(Integer::compare)
                .orElse(null);
    }
}
