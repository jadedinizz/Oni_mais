package Classes;

public class Aluno extends Pessoa {
    protected String instituicao;
    protected String email;
    protected int telefone;
    protected String end;

    public Aluno(String CPF, String nome, int idade, String instituicao, String email, int telefone, String end) {
        super(CPF, nome, idade);
        this.instituicao = instituicao;
        this.email = email;
        this.telefone = telefone;
        this.end = end;
    }
}
