public class NotaAluno
{
    private double nota1, nota2, nota3, notafinal, restante;

    public NotaAluno(double x, double y, double z)
    {
        nota1 = x;
        nota2 = y;
        nota3 = z;
    }

    public void calcularnota()
    {
        notafinal = nota1 + nota2 + nota3;
    }

    public void pontorestante()
    {
        if (notafinal < 60)
        {
            restante = 60 - notafinal;
        }
    }

    public void passou()
    {
        System.out.printf("NOTA FINAL = %.2f%n", notafinal);
        if(notafinal < 60)
        {
            System.out.println("REPROVADO");
            System.out.printf("FALTAM %.2f PONTOS%n", restante);
        }
        else
        {
            System.out.println("APROVADO");
        }
    }
}