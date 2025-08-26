import java.util.Scanner;

public class Crescent {
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        //insere os três número
        System.out.println("Digite o primeiro número!");
        double A = input.nextDouble();
        System.out.println("Digite o segundo número!");
        double B = input.nextDouble();
        System.out.println("Digite o terceiro numero!");
        double C = input.nextDouble();

        if (A > B)
        {
            double temp = A;
            A = B;
            B = temp;
        }

        if (A > C) {
            double temp = A;
            A = C;
            C = temp;
        }
        if (B > C) {
            double temp = B;
            B = C;
            C = temp;
        }
        System.out.println("Os números em ordem Crescente são: " + A + ", " + B + ", " + C);
        input.close();
    }
}