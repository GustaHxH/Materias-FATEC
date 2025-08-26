import java.util.Scanner;

public class idade
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Na etapa a frente você colocara sua idade em anos, meses e dias respectivamente: ");
        //insere a quantidade de anos 
        System.out.println("Quantos anos: ");
        int anos = input.nextInt();
        //insere a quantidade de meses
        System.out.println("Quantos meses: ");
        int meses = input.nextInt();
        //insere quantos dias
        System.out.println("Quantos dias: ");
        int dias = input.nextInt();
        //conversão em dias
        int diastotais = (anos * 365) + (meses * 30) + dias;
        System.out.println("Sua idade em dias é: " + diastotais);

        //fecha o input
        input.close();
    }
}
