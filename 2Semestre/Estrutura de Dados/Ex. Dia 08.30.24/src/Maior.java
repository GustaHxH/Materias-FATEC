import java.util.Scanner;

public class Maior 
{
    public static void main(String[]args)
    {
        //Faz a entrada dos três números
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double N1 = input.nextDouble();
        System.out.println("Insira o segundo número: ");
        double N2 = input.nextDouble();
        System.out.println("Insira o terceiro número: ");
        double N3 = input.nextDouble();

        //cria uma nova variavel
        double maior = N1;

        //ve qual dos números é o maior
        if (N2 > maior)
        {
            maior = N2;
        }
        if (N3 > maior)
        {
            maior = N3;
        }
        System.out.println("O maior número é o: " + maior);
        input.close();
    }
}