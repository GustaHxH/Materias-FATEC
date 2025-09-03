public class Triangulo extends Figura
{
    private double base;
    private double autura;

    public Triangulo(double base, double autura,String cor)
    {
        super(cor);
        this.base = base;
        this.autura = autura;
    }

    public double getbase()
    {
        return base;
    }

    public double getAutura()
    {
        return autura;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setAutura(double autura)
    {
        this.autura = autura;
    }

    public double area()
    {
        return base * autura / 2;
    }

    @Override
    public String toString()
    {
        return "A base do triagulo é: " + base + " enquanto a sua autura é: " + autura + " e tem sua area tem: " + area() + " e sua cor é: " + cor;
    }
}
