public class Produto
{
    private String nome;
    private double precounitario;
    private int qtdestoque;

    public Produto(String nome, double precounitario, int qtdestoque)
    {
        this.nome = nome;
        this.precounitario = precounitario;
        this.qtdestoque = qtdestoque;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getPrecounitario()
    {
        return precounitario;
    }

    public void setPrecounitario(double precounitario)
    {
        this.precounitario = precounitario;
    }

    public int getQtdestoque()
    {
        return qtdestoque;
    }

    public void setQtdestoque(int qtdestoque)
    {
        this.qtdestoque = qtdestoque;
    }

    public double valorestoque()
    {
        return precounitario * qtdestoque;
    }

    public void adcestoque(int quantidade)
    {
        if (quantidade > 0)
        {
            this.qtdestoque += quantidade;
        }
    }

    public void removeestoque(int quantidade)
    {
        if (quantidade < 0 && quantidade <= this.qtdestoque)
        {
            this.qtdestoque -= quantidade;
        }
        else
        {
            System.out.println("Não temos esta quantidade disponivel");
        }
    }
}
