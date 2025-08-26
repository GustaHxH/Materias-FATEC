import java.util.Scanner;

public class DolarReal
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        //Recebe a cotação do dolar no dia
        System.out.println("Qual o valor do real pera5,48nte a 1 dolar?: R$");
        double cotacao = input.nextDouble();
        //Solicita os dolares da pessoa
        System.out.println("Quantos dolares você tem?: U$");
        double dolar = input.nextDouble();
        //Faz a conversão
        double conversao = cotacao * dolar;
        System.out.println("O valor do Real convertido é de: R$" + conversao);

        //fecha o input
        input.close();
    }
}