public abstract class Figura
{
    protected String cor;

    Figura(String cor)
    {
        this.cor = cor;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public static void main(String[]args)
    {
        Circulo circulo = new Circulo(5, "Vermelho");
        Triangulo triangulo = new Triangulo(5,10, "Verde");
        Retangulo retangulo = new Retangulo(10,5, "Azul");


        System.out.println(circulo.toString());
        System.out.println(triangulo.toString());
        System.out.println(retangulo.toString());
    }
}
