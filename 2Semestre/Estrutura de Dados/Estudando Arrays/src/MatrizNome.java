import java.util.Scanner;

public class MatrizNome
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String[][]nomes = new String[3][3];

        int i, j;

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.println("Insira um nome: ");
                nomes[i][j] = sc.nextLine();
            }
        }

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.print(" " + nomes[i][j]);
            }
            System.out.println(" ");
        }

        sc.close();
    }
}
