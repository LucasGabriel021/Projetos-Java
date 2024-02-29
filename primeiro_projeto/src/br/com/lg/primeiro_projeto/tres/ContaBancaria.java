package br.com.lg.primeiro_projeto.tres;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Valor indisponível");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo na conta é de: " + this.saldo);
    }
}
