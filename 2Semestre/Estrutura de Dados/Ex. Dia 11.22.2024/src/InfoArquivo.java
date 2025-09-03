import java.io.File;

public class InfoArquivo
{
    public static void main(String[]args)
    {
        File meuObj = new File("arquivoteste.txt");
        if(meuObj.exists())
        {
            System.out.println("Nome do arquivo: " + meuObj.getName());
            System.out.println("Absolute path: " + meuObj.getAbsolutePath());
            System.out.println("Gravavel: " + meuObj.canWrite());
            System.out.println("Legivel: " + meuObj.canRead());
            System.out.println("Tamanho do arquivo em Bytes: " + meuObj.length());
        }else
        {
            System.out.println("Esse arquivo não existe!!");
        }
    }
}
