import java.util.Scanner;

public class ParouImpar
{
    public static void main(String[]args)
    {
        //pede a entrada de um número
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int N = input.nextInt();

        //ve se é par ou impar
        if (N % 2 == 0)
        {
            System.out.println("O número inserido é par!");
        }
        else
        {
            System.out.println("O número é impar!");
        }
        input.close();
    }
}
