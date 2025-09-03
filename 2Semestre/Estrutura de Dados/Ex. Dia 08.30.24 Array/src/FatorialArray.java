import java.util.Scanner;

public class FatorialArray
{
    public static void main(String[]args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int A[] = new int [5];
        int Bfato[] = new int[5];

        //cria um loop para colocar os números
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Coloque o " + (i+1) +"° número: ");
            A[i] = scanner.nextInt();
        }

        //cria um novo loop pra fazer os fatoriais
        for (int i = 0; i < 5; i++) {
            int fatorial = 1;
            for (int j = 1; j <= A[i]; j++)
            {
                fatorial *= j;
            }
            Bfato[i] = fatorial;
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Valores da lista A São: " + A[i] + " e os valores da lista B são: " + Bfato[i]);
        }
        scanner.close();
    }
}
