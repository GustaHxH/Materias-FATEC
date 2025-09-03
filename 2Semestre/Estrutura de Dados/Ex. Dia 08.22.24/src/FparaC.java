import java.util.Scanner;
 
public class FparaC
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    //recebe a temperatua
	    System.out.println("Insira a temperatura em Farenheit:");
        double F = input.nextDouble();
	    //conversão de temperatura
	    double C = (F - 32) * (5.0 / 9);
	    //imprime a saída
		System.out.println("A temperatura em Celcius é: " + C);
		input.close();
	}
}