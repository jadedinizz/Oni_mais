package Classes;

public abstract class Pessoa {
    protected String CPF;
    protected String nome;
    protected int idade;
    protected String email;
    protected String telefone;
    protected String endereco;

    public Pessoa(String CPF, String nome, int idade, String email, String telefone, String endereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
