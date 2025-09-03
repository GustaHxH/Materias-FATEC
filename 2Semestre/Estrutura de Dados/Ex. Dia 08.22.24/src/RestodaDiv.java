import java.util.Scanner;

public class RestodaDiv {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        //Inserir um número
        System.out.println("Insira um numero de sua escolha: ");
        double N = input.nextDouble();
        double resto = N % 6;
        System.out.println("O resto da divisão por 6 é: " + resto);

        //Fecha o input
        input.close();
    }
}