package br.com.lg.aula_01.exemplo02;

public class Main {
    public static void main(String[] args) {

        Thread threadSoma = new Thread(new Soma(2, 4));
        Thread threadSubtrair = new Thread(new Subtrair(5, 2));
        Thread threadMultiplicar = new Thread(new Multiplicar(9, 5));
        Thread threadDivisao = new Thread(new Divisao(10, 5));

        threadSoma.start();
        System.out.println("Nome da thread: " + threadSoma.getName());
        threadSubtrair.start();
        System.out.println("Nome da thread: " + threadSubtrair.getName());
        threadMultiplicar.start();
        System.out.println("Nome da thread: " + threadMultiplicar.getName());
        threadDivisao.start();
        System.out.println("Nome da thread: " + threadDivisao.getName());

    }
}
