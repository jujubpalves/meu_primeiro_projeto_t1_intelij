import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Vetor para armazenar a produção dos 5 talhões
        double[] producao = new double[5];

        double total = 0;

        // Entrada da produção de cada talhão
        for (int i = 0; i < producao.length; i++) {

            System.out.print("Digite a produção do talhão " + (i + 1) + ", em kg: ");
            producao[i] = entrada.nextDouble();

            // Soma a produção ao total
            total += producao[i];
        }

        // Mostra a produção de cada talhão
        System.out.println("\n===== PRODUÇÃO POR TALHÃO =====");

        for (int i = 0; i < producao.length; i++) {
            System.out.println("Talhão " + (i + 1) + ": " + producao[i] + " kg");
        }

        // Mostra o total geral
        System.out.println("\nTotal geral produzido: " + total + " kg");

    }
}