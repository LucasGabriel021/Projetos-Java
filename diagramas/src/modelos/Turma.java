package modelos;

public class Turma {
    private String codigo;
    private String sala;
    private String horario;

    public Turma(String codigo, String sala, String horario) {
        this.codigo = codigo;
        this.sala = sala;
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }

    public boolean estaAberta() {
        if(this.codigo == "1") {
            return true;
        }
        return false;
    }

    public void definirProfessor(Professor professor) {
        System.out.println("O professor dessa turma é " + professor);
    }

    public void incluirAluno(Aluno aluno) {
        System.out.println("O aluno " + aluno + " foi matriculado");
    }
}
