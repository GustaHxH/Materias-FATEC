public class ArrayMult
{
    public static void main(String[]args) throws Exception
    {
        //cria um array com um loop para ser preenchido ate 10
        int L1[] = new int[10];
        for(int i = 0; i < 10; i++)
        {
            L1[i] = i + 1;
        }
        //Cria um array com um loop para ser preenchido com o dobro da lista1
        int L2[] = new int[10];
        for(int i = 0; i < 10; i++)
        {
            L2[i] = L1[i] * 2;
        }
        System.out.print("Lista A: ");
        //imprime com um loop todos os valores da lista1
        for(int i = 0; i < 10; i++)
        {
            System.out.print(L1[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Lista B: ");
        //imprime com todos os valores a lista2
        for(int i = 0; i < 10; i++)
        {
            System.out.print(L2[i] + " ");
        }
    }
}