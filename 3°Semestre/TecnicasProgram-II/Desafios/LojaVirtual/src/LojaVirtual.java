interface Produto {
    String getNome();
    double getPreco();
}

class Telefone implements Produto {
    private String nome;
    private double preco;
    
    public Telefone(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
}

class Camisa implements Produto {
    private String nome;
    private double preco;
    
    public Camisa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
}

interface FabricaProduto {
    Produto criarEletronico();
    Produto criarModa();
}

class FabricaEletronico implements FabricaProduto {
    public Produto criarEletronico() {
        return new Telefone("Celularr", 2500.0);
    }
    
    public Produto criarModa() {
        return new Camisa("Camisa", 120.0);
    }
}

class FabricaModa implements FabricaProduto {
    public Produto criarEletronico() {
        return new Telefone("Celular básico", 800.0);
    }
    
    public Produto criarModa() {
        return new Camisa("Camisa social", 200.0);
    }
}

public class LojaVirtual {
    public static void main(String[] args) {
        FabricaProduto fabrica1 = new FabricaEletronico();
        FabricaProduto fabrica2 = new FabricaModa();
        
        Produto produto1 = fabrica1.criarEletronico();
        Produto produto2 = fabrica1.criarModa();
        Produto produto3 = fabrica2.criarEletronico();
        Produto produto4 = fabrica2.criarModa();
        
        System.out.println("Produtos disponíveis:");
        System.out.println(produto1.getNome() + " - R$ " + produto1.getPreco());
        System.out.println(produto2.getNome() + " - R$ " + produto2.getPreco());
        System.out.println(produto3.getNome() + " - R$ " + produto3.getPreco());
        System.out.println(produto4.getNome() + " - R$ " + produto4.getPreco());
    }
}
