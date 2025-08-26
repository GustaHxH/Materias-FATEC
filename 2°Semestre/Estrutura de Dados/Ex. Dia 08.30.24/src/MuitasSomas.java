public class MuitasSomas
{
    public static void main(String[]args)
    {
        //crio uma variavel para usar depois
    int somas = 0;

    for (int i = 1; i <= 100; i++)
    {
        somas += i;
    }
    System.out.println("A soma dos números de 1 à 100 resulta em: " + somas);
    }
}
