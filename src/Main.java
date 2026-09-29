import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] consumo = new double[12];

        double maiorConsumo =0;
        int setorMaiorConsumo = 0;

        for (int i = 0; i < consumo.length; i++) {

            System.out.print("Digite o consumo de água do setor  " + (i + 1) + ", em litros: ");
            consumo[i] = entrada.nextDouble();


            if (i==0 || consumo[i] > maiorConsumo) {
                maiorConsumo = consumo[i];
                setorMaiorConsumo = i + 1;
            }
        }


        System.out.println("===== RESULTADOS =====");
        System.out.println("Setor que mais consumiu água: " + setorMaiorConsumo);
        System.out.println("Maior consumo: " + maiorConsumo + " litros");

    }
}