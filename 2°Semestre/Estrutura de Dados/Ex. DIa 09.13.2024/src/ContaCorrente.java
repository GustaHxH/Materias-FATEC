public class ContaCorrente
{
    private String nome;
    private String sexo;
    private int idade;
    private int conta;
    private String flag;
    private double saldo;

    public ContaCorrente(String nome, String sexo, int idade, int conta, String flag, double saldo)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.conta = conta;
        this.flag = flag;
        this.saldo = saldo;
    }

    //GET e SET para nome
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    //GET e SET para sexo
    public String getSexo()
    {
        return sexo;
    }
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    //GET e SET para idade
    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    //GET e SET para conta
    public int getConta()
    {
        return conta;
    }
    public void setConta(int conta)
    {
        this.conta = conta;
    }

    //GET e SET para flag
    public String getFlag()
    {
        return flag;
    }
    public void setFlag(String flag)
    {
        this.flag = flag;
    }

    //GET e SET para saldo
    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    //metodo de saque
    public void saque(double valor)
    {
        if(valor > saldo)
        {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }else
        {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    //metodo de deposito
    public void deposito(double valor)
    {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    //metodo para imprimir o saldo
    public void imprimirSaldo()
    {
        System.out.println("====================================");
        System.out.println("Nome do Correntista: " + nome);
        System.out.println("Número da Conta: " + conta);
        System.out.println("Conta Conjunta (Flag): " + flag);
        System.out.println("Saldo Atual: R$" + saldo);
        System.out.println("====================================");
    }

}