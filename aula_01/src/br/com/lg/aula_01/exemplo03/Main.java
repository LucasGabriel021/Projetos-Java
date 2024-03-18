package br.com.lg.aula_01.exemplo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> minhaLista = new ArrayList<>(Arrays.asList(1, 2, 5, 7, 9, 77, 12, 18, 21, 25, 33, 11));

        int numeroThreads = 4;
        int tamanho = minhaLista.size() / numeroThreads;
        ExecutorService executor = Executors.newFixedThreadPool(numeroThreads);
        List<Callable<Integer>> tarefas = new ArrayList<>();

        for (int i = 0; i < numeroThreads; i++) {
            int numeroInicial = i * tamanho;
            int numeroFinal = (i == numeroThreads - 1) ? minhaLista.size() : (i + 1) * tamanho;
            Callable<Integer> tarefa = new MaiorValor(minhaLista, numeroInicial, numeroFinal);
            tarefas.add(tarefa);
        }

        List<Future<Integer>> futures = executor.invokeAll(tarefas);
        Integer maxVALUE = Integer.MIN_VALUE;
        for(Future<Integer> future : futures) {
            Integer valor = future.get();
            if(valor > maxVALUE) {
                maxVALUE = valor;
            }
        }

        System.out.println("Maior valor da lista é: " + maxVALUE);
        executor.shutdown();
    }
}
