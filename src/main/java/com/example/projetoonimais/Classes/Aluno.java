package com.example.projetoonimais.Classes;

import java.util.EnumSet;


public class Aluno extends Pessoa {
    protected String instituicao;
    protected String email;
    protected int telefone;
    protected String end;
    private EnumSet<Dias> diasDeAula;


    public Aluno(String CPF, String nome, int idade, String email, String telefone, String endereco, String instituicao, String email1, int telefone1, String end) {
        super(CPF, nome, idade, email, telefone, endereco);
        this.instituicao = instituicao;
        this.email = email1;
        this.telefone = telefone1;
        this.end = end;
    }


}
