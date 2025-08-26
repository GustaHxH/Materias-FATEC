import java.util.Scanner;

public class Taxad
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        //Coloque o valor da prestação
        System.out.println("Insira o valor da prestação: ");
        double valor = input.nextDouble();
        //Coloque os dias atrasados
        System.out.println("Quantos dias a conta esta atrasada?: ");
        double tempo = input.nextDouble();
        //coloque o juros
        System.out.println("Qual o jurus diário?: ");
        double taxa = input.nextDouble();
        //Calcula a nova prestação
        double prestacao = valor + (valor*(taxa / 100) * tempo);
        System.out.println("O valor da fatura atualizada é de: R$" + prestacao);

        //fecha o input
        input.close();
    }
}