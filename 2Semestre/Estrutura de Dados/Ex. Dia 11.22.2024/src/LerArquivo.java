import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo
{
    public static void main(String[]args)
    {
        try
        {
            File meuObj = new File("arquivoteste.txt");
            Scanner meuLeitor = new Scanner(meuObj);
            while(meuLeitor.hasNextLine())
            {
                String data = meuLeitor.nextLine();
                System.out.println(data);
            }
            meuLeitor.close();
        }catch (FileNotFoundException e)
        {
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}