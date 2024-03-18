package br.com.lg.aula_01.exemplo02;

public class Soma implements Runnable{
    private double valor1;
    private double valor2;

    public Soma(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public void run() {
        System.out.println(String.format("Soma dos dois valores é: %.2f", valor1 + valor2));
    }
}
