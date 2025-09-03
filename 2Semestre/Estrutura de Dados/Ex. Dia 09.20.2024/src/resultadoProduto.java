    import java.util.Scanner;

    public class resultadoProduto
    {
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do produto");
            String nomeproduto = sc.nextLine();

            System.out.println("Digite o preço do produto");
            double precounitario = sc.nextDouble();

            System.out.println("Digite a quantidade do produto");
            int qtdproduto = sc.nextInt();

            Produto produto = new Produto(nomeproduto, precounitario, qtdproduto);

            System.err.println("O nome do produto é: " + produto.getNome());
            System.out.println("O valor do produto é: " + produto.getPrecounitario());
            System.out.println("A quantidade em estoque é de: " + produto.getQtdestoque());
            System.out.printf("O valor total do estoque é de R$ %.2f%n", produto.valorestoque());   

            System.out.print("Digite a quantidade de unidades a adicionar ao estoque: ");
            int adicionar = sc.nextInt();
            produto.adcestoque(adicionar);

            System.out.print("Digite a quantidade de unidades a remover do estoque: ");
            int remover = sc.nextInt();
            produto.removeestoque(remover);

            System.out.println("Quantidade atualizada do estoque: " + produto.getQtdestoque());
            System.out.printf("Valor do estoque atualizado R$ %.2f%n", produto.valorestoque());
            
            sc.close();
        }
    }
