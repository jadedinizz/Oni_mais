package Classes;

public class Motorista extends Pessoa {
    private int CNH;
    private int telefone;


    public Motorista(String CPF, String nome, int idade, String email, String telefone, String endereco, int CNH, int telefone1) {
        super(CPF, nome, idade, email, telefone, endereco);
        this.CNH = CNH;
        this.telefone = telefone1;
    }
}
