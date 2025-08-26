package src;
import java.util.Scanner;

public class Retangulo
{
    double largura;
    double altura;
    double area;
    double perimetro;
    double diagonal;

    //metodo para exibir os dados 
    public void exibirdados()
    {
        System.out.printf("ÁREA = %.2f%n", area);
        System.out.printf("PERÍMETRO = %.2f%n", perimetro);
        System.out.printf("DIAGONAL = %.2f%n", diagonal);
    }

    // Método para inserir os dados
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            Retangulo retangulo = new Retangulo();
            System.out.print("Digite a altura: ");
            retangulo.altura = sc.nextDouble();
            System.out.print("Digite a largura: ");
            retangulo.largura = sc.nextDouble();

            retangulo.area = retangulo.altura * retangulo.largura;
            retangulo.perimetro = (retangulo.altura * 2) + (retangulo.largura * 2);
            retangulo.diagonal = Math.sqrt(Math.pow(retangulo.largura, 2) + Math.pow(retangulo.altura, 2));

            retangulo.exibirdados();
        }
    }
}
