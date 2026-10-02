import java.util.Scanner;

//Atividade 8 - Controle de Pragas
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int maior = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        // Preenchendo a matriz
        System.out.println("Digite a quantidade de focos de pragas:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Região [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se é o maior valor
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // Resultado
        System.out.println("\nRegião com maior quantidade de focos:");
        System.out.println("Linha: " + linhaMaior);
        System.out.println("Coluna: " + colunaMaior);
        System.out.println("Quantidade de focos: " + maior);


    }
}