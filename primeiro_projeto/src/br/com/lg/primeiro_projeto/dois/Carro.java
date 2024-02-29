package br.com.lg.primeiro_projeto.dois;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public double maiorPreco() {
        double maiorPreco = 0;

        if(precoAno1 > precoAno2 && precoAno1 > precoAno3) {
            maiorPreco = precoAno1;
        } else if(precoAno2 > precoAno1 && precoAno2 > precoAno3) {
            maiorPreco = precoAno2;
        } else {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    public double menorPreco() {
        double menorPreco = 0;

        if(precoAno1 < precoAno2 && precoAno1 < precoAno3) {
            menorPreco = precoAno1;
        } else if(precoAno2 < precoAno1 && precoAno2 < precoAno3) {
            menorPreco = precoAno2;
        } else {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public void exibirInfos() {
        System.out.println("Modelo do carro: " + nomeModelo);
        System.out.println("Preço do 1° ano: " + precoAno1);
        System.out.println("Preço do 2° ano: " + precoAno2);
        System.out.println("Preço do 3° ano: " + precoAno3);
        System.out.println("Maior valor: " + this.maiorPreco());
        System.out.println("Menor valor: " + this.menorPreco());
    }
}