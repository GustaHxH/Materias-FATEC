import java.util.Scanner;

public class Array
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int [][] num = new int [3][3];
        int i, j;

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.println("insira um número: ");
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println(" ");
        System.out.println("MATRIZ 3X3:");
        System.out.println(" ");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.print(" " + num[i][j]);
            }
            System.out.println("");
        }

        sc.close();
    }
}