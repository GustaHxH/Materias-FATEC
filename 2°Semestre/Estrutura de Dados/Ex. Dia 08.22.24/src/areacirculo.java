import java.util.Scanner;

public class areacirculo
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        //Inserir a área do circulo
        System.out.println("Insira o raio do circulo: ");
        double raio = input.nextDouble();
        //Calcula a área do circulo
        double area = 3.14159 * (Math.pow(raio, 2));
        //Imprime a saída com a área
        System.out.println("A área do circulo é: " + area);

        //Fecha o input
        input.close();
    }
}
