public class Onibus extends Veiculo
{
    private int assentos;

    public Onibus(String placa, int ano, int assentos)
    {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos()
    {
        return assentos;
    }

    public void setAssentos(int assentos)
    {
        this.assentos = assentos;
    }


    //nessa parte sobrescrevo o metodo exibir dados para incluir os assentos
    @Override
    public void exibirDados()
    {
        super.exibirDados(); //chama o metodo da Superclasse
        System.out.println("Quantidade de assentos: " + assentos);
    }
}
