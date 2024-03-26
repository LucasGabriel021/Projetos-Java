package br.com.ucb.a.aula04.modelos;

public class Incremento extends Thread{
    private Contador contador;

    public Incremento(Contador contador) {
        this.contador = contador;
    }

    public void run() {
        System.out.println(this.getName() + " incrementado contador... ");
        this.contador.incremento();
    }
}
