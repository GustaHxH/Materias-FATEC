import java.util.Scanner;

public class ResultadoFinal
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira Nota(de 0 a 30): ");
        double nota1 = sc.nextInt();

        System.out.println("Insira a segunda Nota(de 0 a 35): ");
        double nota2 = sc.nextInt();

        System.out.println("Insira a terceira Nota(de 0 a 35): ");
        double nota3 = sc.nextInt();

        NotaAluno aluno = new NotaAluno(nota1, nota2, nota3);
        aluno.calcularnota();
        aluno.pontorestante();
        aluno.passou();

        sc.close();
    }
}
