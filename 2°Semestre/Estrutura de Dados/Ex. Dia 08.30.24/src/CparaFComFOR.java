public class CparaFComFOR {
    public static void main(String[] args) {
        //Criei cabeçalhos das colunas
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");

        // Loop para converter e exibir os valores de 10 a 100 graus Celsius, de 10 em 10 graus
        for (int Cel = 10; Cel <= 100; Cel += 10) {
            // Calcula a temperatura em Fahrenheit
            double Far = (9 * Cel / 5) + 32;

            // Exibe os valores formatados
            System.out.printf("%-10d %-10.1f%n", Cel, Far);
        }
    }
}
