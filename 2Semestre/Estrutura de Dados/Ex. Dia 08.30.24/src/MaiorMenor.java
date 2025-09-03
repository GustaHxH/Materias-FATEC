import java.util.Scanner;

public class MaiorMenor
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

        //cria uma variável maior
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
        System.out.println("O maior número é: " + maior);

        //cria uma variável menor
        double menor = N1;
        
        //ve qual dos números é menor
        if (N2 < menor)
        {
            menor = N2;
        }
        if (N3 < menor)
        {
            menor = N3;
        }
        System.out.println("o menor número é: " + menor);
        input.close();
    }
}
