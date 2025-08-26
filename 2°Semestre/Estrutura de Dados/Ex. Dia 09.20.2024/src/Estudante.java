public class Estudante
{
    String nome;
    int idade;
    double medianota;

    public Estudante(String nome,int idade,double medianota)
    {
        this.nome = nome;
        this.idade = idade;
        this.medianota = medianota;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public double getmediaNota()
    {
        return medianota;
    }

    public void setMedianota(double medianota)
    {
        this.medianota = medianota;
    }

    public void aprovado(double medianota)
    {
        if (medianota < 7)
        {
            System.out.println("Situação: REPROVADO!!");
        }
        else
        {
            System.out.println("Situação: APROVADO!!");
        }
    }
}