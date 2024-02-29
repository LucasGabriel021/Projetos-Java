package br.com.lg.primeiro_projeto.tres;

public class VerificarPrimo extends NumerosPrimos {
    public void verificaSeEhPrimo(int numero) {
        if(verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
}
