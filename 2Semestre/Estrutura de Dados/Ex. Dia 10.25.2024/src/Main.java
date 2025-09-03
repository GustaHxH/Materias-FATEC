public class Main
{
    public static void main(String[]args)
    {
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();
        Transporte aviao = new Aviao();

        transporteMover(carro);
        transporteMover(bicicleta);
        transporteMover(aviao);
    }

        static void transporteMover(Transporte transporte)
        {
            transporte.mover();
        }
}
