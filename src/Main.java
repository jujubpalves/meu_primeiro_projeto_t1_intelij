import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] temperaturas = new double[10];

        int diasAcimaDe30 = 0;

        for (int i = 0; i < temperaturas.length; i++) {

            System.out.print("Digite a temperatura do dia " + (i + 1) + ", em °C: ");
            temperaturas[i] = entrada.nextDouble();


            if (temperaturas[i] > 30) {
                diasAcimaDe30++;
            }
        }


        System.out.println("===== RESULTADOS =====");
        System.out.println("Quantidade de dias acima de 30°C: " + diasAcimaDe30);;

    }
}