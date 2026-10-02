import java.util.Scanner;

// Vetores e Matrizes
// Atividade 6 - Produção Agrícola por Mês e Cultura

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] producao = new double[4][3];
        double[] totalPorCultura = new double[3];
        for (int mes = 0; mes < 4; mes++) {
            System.out.printf("Mês %d \n", mes + 1);
            for (int cultura = 0; cultura < 3; cultura++) {
                System.out.printf("Informe a produção da Cultura %d: ", cultura + 1);
                producao[mes][cultura] = entrada.nextDouble();
            }
        }

        for (int cultura = 0; cultura < 3; cultura++) {
            for (int mes = 0; mes < 4; mes++) {
                totalPorCultura[cultura] += producao[mes][cultura];
            }
        }

        System.out.println("\nRelatório de Produção Total por Cultura");
        for (int cultura = 0; cultura < 3; cultura++) {
            System.out.printf("Cultura %d: %.2f\n", (cultura + 1), totalPorCultura[cultura]);
        }

    }
}