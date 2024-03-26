import modelos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno("UC112222", "Turma 1","09:00");
        meuAluno.setMatricula(555555);
        meuAluno.setNome("Lucas");

        System.out.println(meuAluno);
    }
}
