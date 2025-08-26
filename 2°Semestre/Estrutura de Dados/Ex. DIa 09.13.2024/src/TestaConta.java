public class TestaConta
{
    public static void main(String[] args)
    {
        // Criando 3 objetos ContaCorrente com os valores especificados
        ContaCorrente conta1 = new ContaCorrente("Fernando", "Masculino", 29, 1234, "Não", 1500.00);
        ContaCorrente conta2 = new ContaCorrente("Maria", "Feminino", 45, 5312, "Sim", 530.31);
        ContaCorrente conta3 = new ContaCorrente("Joao", "Masculino", 54, 9621, "Sim", 4325.12);

        // Exibindo os saldos iniciais
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        conta3.imprimirSaldo();

        // Realizando oos metodos ja criados anteriormente
        // Saque na conta 1
        conta1.saque(2000.00);
        // Depósito na conta 2
        conta2.deposito(300.00);
        // Saque na conta 3
        conta3.saque(500.00); 

        // Exibindo os saldos após as operações
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        conta3.imprimirSaldo();
    }
}