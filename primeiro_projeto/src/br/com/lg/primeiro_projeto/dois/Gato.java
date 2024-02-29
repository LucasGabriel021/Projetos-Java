package br.com.lg.primeiro_projeto.dois;

public class Gato extends Animal{
    public void arranharMoveis() {
        System.out.println("Arranhar Móveis");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
