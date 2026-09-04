import java.util.Scanner;

// Exercício 7 - Plano de Saúde Empresarial
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo de contratação: ");
        double tempo = sc.nextDouble();


        if (tempo >= 3) {
            System.out.println("O plano de saúde  está disponível para você.");
        } else {
            System.out.println("Serviço não disponível para você.");
        }
    }
}