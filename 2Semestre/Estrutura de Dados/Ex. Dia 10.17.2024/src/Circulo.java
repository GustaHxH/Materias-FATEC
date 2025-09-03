public class Circulo extends Figura
{
    private double raio;

    public Circulo(double raio, String cor)
    {
        super(cor);
        this.raio = raio;
    }

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }

    public double area()
    {
        return 3.14159 * raio * raio;
    }

    public double diametro()
    {
        return 2 * raio;
    }

    @Override
    public String toString()
    {
         return "O raio do circulo é: " + raio + " já o seu diâmetro é de: " + diametro() + " enquanto a área do circulo é de: " + area() + " e a sua cor é: " + cor;
    }
}
