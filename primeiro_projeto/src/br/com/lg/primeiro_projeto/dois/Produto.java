package br.com.lg.primeiro_projeto.dois;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double valor) {
        double desconto = preco * (valor / 100);
        preco -= desconto;
    }
}
