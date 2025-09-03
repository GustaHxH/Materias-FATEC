import java.util.Scanner;
 
public class CparaF
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    //recebe a temperatua
	    System.out.println("Insira a temperatura em Celcius:");
           double C = input.nextDouble();
	    //conversão de temperatura
	    double Far = (9 * C / 5) + 32;
	    //imprime a saída
		System.out.println("A temperatura em Fahrenheit é: " + Far);
		input.close();
	}
}