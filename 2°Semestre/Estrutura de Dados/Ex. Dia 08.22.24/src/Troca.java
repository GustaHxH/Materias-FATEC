import java.util.Scanner;

public class Troca {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        //Coloque o valor de A
        System.out.println("Insira o valor de A:");
        int A = input.nextInt();
        //Coloque o valor de B
        System.out.println("Coloque o valor de B:");
        int B = input.nextInt();
        //exibe os valores de A e B
        System.out.println("Valores de A e B antes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        //Usar o temp para deixar o A numa variavel temporarea
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores de A e B depois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        //Fechar o input
        input.close();
    }
}