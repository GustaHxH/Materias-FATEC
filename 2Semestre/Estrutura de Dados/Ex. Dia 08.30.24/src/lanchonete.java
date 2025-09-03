import java.util.Scanner;

public class lanchonete
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o codigo do pedido: ");
        int cod = input.nextInt();
        

        //cria algumas situações onde a depender do codigo vira um item diferente
        if (cod == 100)
        {
            System.out.println("Insira a quantidade de intens: ");
            int qtd = input.nextInt();
            double preco = 1.20;
            double ptotal = preco * qtd;
            System.out.printf("O valor pago pelo(s) Cachorro quente será de: R$%.2f%n", ptotal);

        }

         if (cod == 101)
         {
            System.out.println("Insira a quantidade de intens: ");
            int qtd = input.nextInt();
            double preco = 1.30;
            double ptotal = preco * qtd;
            System.out.printf("O valor pago pelo(s) Bauru simples será de: R$%.2f%n", ptotal);
        }
        if (cod == 102)
        {
            System.out.println("Insira a quantidade de intens: ");
            int qtd = input.nextInt();
            double preco = 1.50;
            double ptotal = preco * qtd;
            System.out.printf("O valor pago pelo(s) Bauru com ovo será de: R$%.2f%n", ptotal);
        }
        if (cod == 103)
        {
            System.out.println("Insira a quantidade de intens: ");
            int qtd = input.nextInt();
            double preco = 1.20;
            double ptotal = preco * qtd;
            System.out.printf("O valor pago pelo(s) Hamburguer será de: R$%.2f%n", ptotal);
        }
        if (cod == 104)
        {
            System.out.printf("Insira a quantidade de intens: ");
            int qtd = input.nextInt();
            double preco = 1.30;
            double ptotal = preco * qtd;
            System.out.printf("O valor pago pelo(s) Chessburguer será de: R$%.2f%n", ptotal);
        }
        if (cod == 105)
        {
            System.out.printf("Insira a quantidade de intens: ");
            int qtd = input.nextInt();
            double preco = 1.00;
            double ptotal = preco * qtd;
            System.out.printf("O valor pago pelo(s) Refrigerante quente será de: R$%.2f%n", ptotal);
        }
        if (cod != 100 && cod != 101 && cod != 102 && cod != 103 && cod != 104 && cod != 105)
        {
            System.out.println("Não exise nenhum item com este codigo!");
        }
        input.close();
    }
}
