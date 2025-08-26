public class UmaDez 
{
    public static void main(String[] args) throws Exception
    {
        //criação de uma array
        int [] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        //criar uma repetição para imprimir as saidas

        for (int pvetor = 0; pvetor < 10; pvetor++)
        {
            System.out.print(numeros[pvetor] + " ");
        }
    }
}