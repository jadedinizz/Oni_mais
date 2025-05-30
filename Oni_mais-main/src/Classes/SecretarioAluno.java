package Classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.EnumSet;
public class SecretarioAluno extends Pessoa implements SecretarioPai {

    private static int totalAlunosSeg = 0;
    private static int totalAlunosTer = 0;
    private static int totalAlunosQua = 0;
    private static int totalAlunosQui = 0;
    private static int totalAlunosSex = 0;
    private static int totalAlunosSab = 0;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    protected EnumSet<Dias> diasSelecionados = EnumSet.noneOf(Dias.class);

    public SecretarioAluno(String CPF, String nome, int idade, String email, String telefone, String endereco) {
        super(CPF, nome, idade, email, telefone, endereco);
    }

    public void verificarPresenca(Dias diaAtual){

        for (Aluno a: alunos){
            EnumSet<Dias> diasSelecionados = a.getDiasSelecionados();

            if (diaAtual == Dias.SEGUNDA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosSeg++;
                }
            } if (diaAtual == Dias.TERCA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosTer++;
                }
            } if (diaAtual == Dias.QUARTA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosQua++;
                }
            } if (diaAtual == Dias.QUINTA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosQui++;
                }
            } if (diaAtual == Dias.SEXTA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosSex++;
                }
            } if (diaAtual == Dias.SABADO) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosSab++;
                }
            }
        }
        // Excessao
        // Se nenhum dia for atribuido "Nenhum dia atribuido"
    }

//    public void alocarDatasAluno(Aluno aluno, EnumSet<Dias> diasDeAula) {
//        aluno.getDiasSelecionados().addAll(diasDeAula);
//    }
    // Colocar os dias que o aluno vai

        // Excessao
        // Se o aluno nao tiver um dia "Nenhum dia atribuido"
    }

    public void alocarInstituicao(Aluno aluno){

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a instituição que você está matriculado?");
        String inst = sc.nextLine();
            aluno.setInstituicao(inst);
        System.out.println("Sua instituição foi registrada!");

        // Pedir para Escrever a instituição
        // é melhor escrever a instituição por que fica mais facíl e tals

        // Excessao
        // Se nada for escrito, escrever algo valido
    }

    public int verificarQuantidadeDeAlunos() {
        // Pegar o vetor de alunos criado acima
        // totalAlunosCadastrados++;


        return 0;
    }

    public void alocarAluno() {
    }

    // Implementacao

    @Override
    public void listarIten() {
        // Printar todos os alunos, faculdades e turnos
    }

    @Override
    public void verificarDados() {

        // Printar dados dos alunos
    }
}
