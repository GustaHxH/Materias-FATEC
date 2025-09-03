import java.util.Scanner;
 
public class Volume
{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        //Insere o valor do raio da lata
        System.out.println("Insira o raio da lata de óleo: ");
        double raio = input.nextDouble();
        //Insere a altura da lata
        System.out.println("Insira a altura da lata de óleo: ");
        double altura = input.nextDouble();
        //formula para o volume 
        //Math.pow é usado para calcular exponenciação
        double volume = 3.14159 * (Math.pow(raio, 2)) *altura;
        //imprime a saida
        System.out.println("O volume da lata é: " + volume);
        input.close();
    }
}