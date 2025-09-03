import java.util.Scanner;

public class Fatorial
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = input.nextInt();
        
        // Inicializa o fatorial como 1
        int fatorial = 1;
        
        // Calcula o fatorial usando um loop
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
        input.close();
    }
}