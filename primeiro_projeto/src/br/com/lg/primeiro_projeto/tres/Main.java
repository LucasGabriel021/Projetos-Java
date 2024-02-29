package br.com.lg.primeiro_projeto.tres;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setNomeModelo("McLaren");
        meuCarro.setPrecoAno1(100);
        meuCarro.setPrecoAno2(10);
        meuCarro.setPrecoAno3(80);
        meuCarro.exibirInfos();

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom();
        meuCachorro.abanarRabo();
        Gato meuGato = new Gato();
        meuGato.emitirSom();
        meuGato.arranharMoveis();

        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.depositar(30000);
        minhaConta.sacar(500);
        minhaConta.consultarSaldo();
        minhaConta.setDesconto(50);


        VerificarPrimo verificador = new VerificarPrimo();
        verificador.verificaSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);    }
}
