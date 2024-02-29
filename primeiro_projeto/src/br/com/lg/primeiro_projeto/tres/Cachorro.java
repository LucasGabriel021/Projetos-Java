package br.com.lg.primeiro_projeto.tres;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void abanarRabo() {
        System.out.println("Abanar Rabo");
    }
}
