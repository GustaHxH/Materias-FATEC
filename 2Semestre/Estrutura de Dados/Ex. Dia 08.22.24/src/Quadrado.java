import java.util.Scanner;

public class Quadrado {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        //Pede um numero ao usuario
        System.out.println("Digite um número inteiro: ");
        int N = input.nextInt();
        //Usa o Math.pow para a exponenciação
        double quadrado = (Math.pow(N,2));
        //Imprime a saída
        System.out.println("O quadrado do numero é: " + quadrado);

        //Fecha o input
        input.close();
    }
    
}