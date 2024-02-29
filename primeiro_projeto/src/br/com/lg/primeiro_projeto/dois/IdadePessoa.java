package br.com.lg.primeiro_projeto.dois;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade() {
        if(idade >= 21) {
            System.out.println("A pessoa é maior de idade!");
        } else {
            System.out.println("A pessoa é menor de idade!");
        }
    }
}
