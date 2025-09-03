public class DadosContaClass
{
    String NumConta;
    String NomeCliente;
    String CPF;
    double Saldo;

    //Metodo para exibir os dados
    public void exibirdados()
            {
                System.out.println("Número da conta: " + NumConta);
                System.out.println("Nome do cliente: " + NomeCliente);
                System.out.println("CPF: " + CPF);
                System.out.println("Saldo disponivel: R$ " + Saldo);
            }

    public static void main(String[]args)
    {
        DadosContaClass dcontas = new DadosContaClass();
            dcontas.NumConta = "58477-7";
            dcontas.NomeCliente = "Augusta Ada Byron King";
            dcontas.CPF = "123.456.789-12";
            dcontas.Saldo = 4578.45;


            //Chama o metodo criado la em cima para exibir estes dados
            dcontas.exibirdados();
    }
            
}