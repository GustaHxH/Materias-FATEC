    import java.util.Scanner;

    public class EstudanteResultado
    {
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Escreva o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Coloque a idade do aluno: ");
            int idade = sc.nextInt();

            System.out.println("Qual a media deste aluno? ");
            double medianota = sc.nextDouble();

            Estudante estudante = new Estudante(nome, idade, medianota);

            System.out.println("O estudante tem " + estudante.getIdade() + "anos");
            System.out.println("O nome dele é: " + estudante.getNome());
            System.out.printf("A media deste aluno foi de %.1f%n", estudante.getmediaNota());
            System.out.println("Portanto...");

            estudante.aprovado(medianota);

            sc.close();

        }
    }
