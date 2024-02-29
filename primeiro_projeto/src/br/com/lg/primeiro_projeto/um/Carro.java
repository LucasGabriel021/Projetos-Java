package br.com.lg.primeiro_projeto.um;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    void calcularAnoCarro() {
        System.out.println(2024 - ano);
    }
}
