public class Veiculo
{
    private String placa;
    private int ano;

    public Veiculo()
    {       }

    public Veiculo(String placa, int ano)
    {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca()
    {
        return placa;
    }

    public int getAno()
    {
        return ano;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public void exibirDados()
    {
        System.out.println("Placa: "+ this.placa);
        System.out.println("Ano: "+ this.placa);
    }
}
