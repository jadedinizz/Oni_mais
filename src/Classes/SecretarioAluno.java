package Classes;

public class SecretarioAluno extends Pessoa implements SecretarioPoggers{

    private static int totalAlunosCadastrados = 0;

    public SecretarioAluno(String CPF, String nome, int idade, String email, String telefone, String endereco) {
        super(CPF, nome, idade, email, telefone, endereco);
    }

    public boolean verificarPresencqa(){
        // Ele vai verificar a presença do dia, que ele botou;
            // Se o dia que ele botou for verdadeiro, retorne verdadeiro
                // Se o dia for diferente do que ele botou retorne falso

        // Excessao
            // Se nenhum dia for atribuido "Nenhum dia atribuido"

        return false;
    }

    public void alocarDataAluno(){
        // Colocar os dias dias que o aluno vai

        // Excessao
            // Se o aluno nao tiver um dia "Nenhum dia atribuido"
    }

    public void alocarInstituicao(){
        // Pedir para Escrever a instituição
            // é melhor escrever a instituição por que fica mais facíl e tals

        // Excessao
            // Se nada for escrito, escrever algo valido
    }

    public int verificarQuantidadeDeAlunos() {
        // Pegar o vetor de alunos criado a cima
        // totalAlunosCadastrados++;


        return 0;
    }

    // Implementacao

    @Override
    public void adicionarIten() {
        // Criar uma instancia de aluno
            // Criar um vetor
                // Adicionar alunos ao vetor
    }

    @Override
    public void alocar() {
        // Criar uma instancia de onibus
            // Criar um vetor de no maximo 30 alunos para o onibus
            // Inserir alunos no onibus
    }

    @Override
    public void listarIten() {
        // Printar todos os alunos, faculdades e turnos
    }

    @Override
    public void verificarDados() {
        // Printar dados dos alunos
    }
}
