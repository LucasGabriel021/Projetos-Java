package modelos;

public class Aluno extends Turma {
    private String nome;
    private int matricula;

    public Aluno(String codigo, String sala, String horario) {
        super(codigo, sala, horario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
