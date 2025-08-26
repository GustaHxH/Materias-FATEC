import java.util.Scanner;
 
public class Mult
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    //recebe a primeira entrada
	    System.out.println("Insira o primeiro número:");
        int n1 = input.nextInt();
	    //recebe a segunda entrada
	    System.out.println("Insira o segundo número:");
	    int n2 = input.nextInt();
	    //multiplicação das variáveis
	    int mult = n1 * n2;
	    //imprime a saída
		System.out.println("A multiplicação entre os dois números é: " + mult);
		input.close();
	}
}