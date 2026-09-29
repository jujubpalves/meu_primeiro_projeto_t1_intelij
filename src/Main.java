import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] umidade = new double[8];
        int contador = 0;

        // Entrada dos valores
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a umidade da área " + (i + 1) + " (%): ");
            umidade[i] = scanner.nextDouble();
        }

        // Conta as áreas com umidade inferior a 40%
        for (int i = 0; i < 8; i++) {
            if (umidade[i] < 40) {
                contador++;
            }
        }

        System.out.println("Quantidade de áreas com umidade inferior a 40%: " + contador);

    }
}