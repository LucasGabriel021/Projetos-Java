package modelos;

public class Professor extends Turma{
    private String nome;
    private String titulacao;

    public Professor(String codigo, String sala, String horario) {
        super(codigo, sala, horario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
