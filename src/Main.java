import java.util.Scanner;

//Atividade 9 - Mapa de Fertilidade do
//Solo
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[6][6];

        // Preenchendo a matriz
        System.out.println("Digite os índices de fertilidade:");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Região [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a média de cada linha
        System.out.println("\nMédia de fertilidade de cada linha:");

        for (int i = 0; i < 6; i++) {
            int soma = 0;

            for (int j = 0; j < 6; j++) {
                soma += matriz[i][j];
            }

            double media = (double) soma / 6;

            System.out.println("Linha " + (i + 1) + ": " + media);
        }

    }
}