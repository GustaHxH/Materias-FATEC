public class Aluno
{
    int ra;
    String nome;
    String endereco;
    String curso;

    //cria um metodo para exibir os dados
    public void exibirdados()
    {
        System.out.println("RA do aluno: " + ra);
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Endereço do aluno: " + endereco);
        System.out.println("Curso do  aluno: " + curso);
    }

    public static void main(String[]args)
    {
        Aluno aluno = new Aluno();
        aluno.ra = 123456789;
        aluno.nome = "Maria Joaquina";
        aluno.endereco = "Av. Brasil, 69";
        aluno.curso = "DSM";

        //chama o metodo exibir dados
        aluno.exibirdados();
    }
}
