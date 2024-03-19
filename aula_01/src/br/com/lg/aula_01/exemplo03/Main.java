package br.com.lg.aula_01.exemplo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer[] minhalista = {1, 2, 5, 7, 9, 77, 12, 18, 21, 25, 33, 11};

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = executor.submit(new MaiorValor(minhalista, 0, minhalista.length - 2));
        Future<Integer> future2 = executor.submit(new MaiorValor(minhalista, minhalista.length / 2, minhalista.length));

        Integer resultado1 = future1.get();
        Integer resultado2 = future2.get();

        executor.shutdown();

        System.out.println("Maior número é: " + Math.max(resultado1, resultado2));
    }
}
