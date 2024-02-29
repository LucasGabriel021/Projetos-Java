package br.com.lg.primeiro_projeto.um;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaTeste = new Pessoa();
        pessoaTeste.exibirMensagem();

        Calculadora calculadoraTeste = new Calculadora();
        System.out.println(calculadoraTeste.retornaDobro(5));

        Musica musicaTeste = new Musica();
        musicaTeste.titulo = "Survivor";
        musicaTeste.artista = "The Score";
        musicaTeste.anoLancamento = 2024;
        musicaTeste.avaliar(10);
        musicaTeste.mediaAvaliacoes();
        musicaTeste.exibirFichaTecnica();

        Carro carroTeste = new Carro();
        carroTeste.modelo = "Siena";
        carroTeste.cor = "Prata";
        carroTeste.ano = 2014;
        carroTeste.calcularAnoCarro();
        carroTeste.exibirFichaTecnica();

        Aluno alunoTeste = new Aluno();
        alunoTeste.nome = "Lucas Gabriel";
        alunoTeste.idade = 21;
        alunoTeste.exibirInfos();
    }
}