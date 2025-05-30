import Classes.Aluno;
import Classes.Dias;
import Classes.Pessoa;

import java.util.ArrayList;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> alunos = new ArrayList<>();
        EnumSet<Dias> diasa1 = EnumSet.of(Dias.SEGUNDA, Dias.TERCA, Dias.QUARTA, Dias.QUINTA);

        alunos.add(new Aluno("1234567890", "João Silva", 20, "joaogoulart@gmail.com",
                "11987654321", "Rua A, 123", "UNIFIP", diasa1));



    }
}