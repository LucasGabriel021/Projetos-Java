package br.com.lg.aula_01.exemplo01;

public class ExemploThread {
    public static void main(String[] args) {
        Ola minhaThread = new Ola();
        minhaThread.start(); // Comando start() inicializa a thread.
        System.out.println("Nome da Thread: " + minhaThread.getName());

        Thread minhaThread2 = new Thread(new Tchau());
        minhaThread2.start();
        System.out.println("Nomde da Thread:" + minhaThread2.getName());
    }
}
