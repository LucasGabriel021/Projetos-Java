package br.com.lg.primeiro_projeto.tres;

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

    public double maiorValor() {
        double maiorValor = 0;

        if(precoAno1 > precoAno2 && precoAno1 > precoAno3) {
            maiorValor = precoAno1;
        } else if(precoAno2 > precoAno1 && precoAno2 > precoAno3) {
            maiorValor = precoAno2;
        } else {
            maiorValor = precoAno3;
        }

        return maiorValor;
    }

    public double menorValor() {
        double menorValor = 0;

        if(precoAno1 < precoAno2 && precoAno1 < precoAno3) {
            menorValor = precoAno1;
        } else if(precoAno2 < precoAno1 && precoAno2 < precoAno3) {
            menorValor = precoAno2;
        } else {
            menorValor = precoAno3;
        }

        return menorValor;
    }

    public void exibirInfos() {
        System.out.println("Nome do modelo: " + this.nomeModelo);
        System.out.println("Preço do 1° ano: " + this.precoAno1);
        System.out.println("Preço do 2° ano: " + this.precoAno2);
        System.out.println("Preço do 3° ano: " + this.precoAno3);
        System.out.println("Maior valor: " + this.maiorValor());
        System.out.println("Menor valor: " + this.menorValor());
    }
}
