public class Retangulo extends Figura
{
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2, String cor)
    {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1()
    {
        return lado1;
    }

    public double getLado2()
    {
        return lado2;
    }

    public void setLado1(double lado1)
    {
        this.lado1 = lado1;
    }

    public void setlado2(double lado2)
    {
        this.lado2 = lado2;
    }

    public double area()
    {
        return lado1 * lado2;
    }

    @Override
    public String toString()
    {
        return "O tamanho do primeiro lado deste retângulo é: " + lado1 + " enquanto o segundo lado é de: " + lado2 + " e a sua área é de: " + area() + "e a sua cor é: " + cor;
    }
}
