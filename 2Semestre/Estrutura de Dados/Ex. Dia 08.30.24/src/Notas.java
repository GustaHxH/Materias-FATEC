import java.util.Scanner;

public class Notas {
    public static void main(String[]args)
    {
        //insere as 4 notas
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double N1 = input.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double N2 = input.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double N3 = input.nextDouble();
        System.out.println("Insira a quarta nota: ");
        double N4 = input.nextDouble();

        //Faz a media das notas
        Double Media = (N1+N2+N3+N4) / 4;
        
        //Faz uma condição
        if (Media >= 7)
        {
            System.out.println("Você foi aprovado!!");
        }
        else
        {
            System.out.println("Você foi reprovado, pois sua média foi: " + Media);
        }
        input.close();
    }
}