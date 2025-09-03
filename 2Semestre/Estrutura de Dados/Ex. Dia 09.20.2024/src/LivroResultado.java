import java.util.Scanner;

public class LivroResultado
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o nome do autor? ");
        String nome = sc.nextLine();

        System.out.print("Qual o nome do Livro? ");
        String titulo = sc.nextLine();

        System.out.print("Qual o ano de lançamento deste livro? ");
        int ano = sc.nextInt();

        Livro livro = new Livro(nome, titulo, ano);

        System.out.println("");
        System.out.println("O livro " + livro.getTitulo() + ", escrito por " + livro.getNomeautor() + ", foi publicado no ano de " + livro.getAnolancamento());

        sc.close();
    }
}
