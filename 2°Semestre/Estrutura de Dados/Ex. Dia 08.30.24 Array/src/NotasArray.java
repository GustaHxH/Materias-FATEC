import java.util.Scanner;

public class NotasArray
{
    public static void main(String[]args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        //crio as listas para serem uzadas mais tarde
        double notasProvas1[] = new double[5];
        double notasProvas2[] = new double[5];
        double medias[] = new double[5];

        //faço um loop para armazenas as notas da prova 1 e prova 2 de cada auluno
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Digite a nota da primeira prova do aluno" + (i + 1) + ": ");
            notasProvas1[i] = scanner.nextDouble();

            System.out.println("Digite a nota da segunda prova do aluno" + (i + 1) + ": ");
            notasProvas2[i] = scanner.nextDouble();
        }

        //loop para as medias
        for(int i = 0; i <5; i++)
        {
            medias[i] = (notasProvas1[i] + notasProvas2[i]) / 2.0;
        }

        //loop para imprimir as medias
        for(int i = 0; i <5; i++)
        {
            System.out.println("A media do aluno " + (i + 1) + " é: " + medias[i]);
        }
        scanner.close();
    }
}