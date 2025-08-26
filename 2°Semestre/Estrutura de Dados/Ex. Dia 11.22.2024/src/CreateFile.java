import java.io.File;
import java.io.IOException; 

public class CreateFile
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            File meuObj = new File("arquivoteste.txt");
            if(meuObj.createNewFile())
            {
                System.out.println("Arquivo Criado: " + meuObj.getName());
            }else
            {
                System.out.println("Arquivo já existente!");
            }
        }
        catch (IOException e)
        {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
}
