import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo
{
    public static void main(String[]args)
    {
        try
        {
            FileWriter meuEscritor = new FileWriter("arquivoteste.txt");
            meuEscritor.write("Num dia de sol, com certeza estará ensolarado!");
            meuEscritor.close();
            System.out.println("Sucesso ao escrever no arquivo!");
        }catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
