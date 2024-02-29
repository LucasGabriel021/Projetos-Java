package br.com.lg.primeiro_projeto.tres;

public class ContaCorrente extends ContaBancaria {
    private double desconto;

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void cobrarTarifaMensal() {
        double saldo = super.getSaldo();
        System.out.println(saldo);
        if(saldo > 0) {
           saldo -= desconto;
            System.out.println("Tarifa mensal é de " + this.desconto + " e seu saldo atual é de " + saldo);
        }
    }
}
