import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] producao = new double[7];

        double total = 0;
        double maior = 0;

        for (int i = 0; i < producao.length; i++) {

            System.out.print("Digite a produção da semana " + (i + 1) + ", em toneladas: ");
            producao[i] = entrada.nextDouble();

            total += producao[i];

            if (i == 0 || producao[i] > maior) {
                maior = producao[i];
            }
        }

        double media = total / producao.length;

        System.out.println("===== RESULTADOS =====");
        System.out.println("Produção total: " + total + " toneladas");
        System.out.println("Média semanal: " + media + " toneladas");
        System.out.println("Maior produção registrada: " + maior + " toneladas");

        entrada.close();
    }
}