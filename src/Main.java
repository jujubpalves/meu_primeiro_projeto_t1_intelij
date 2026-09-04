import java.util.Scanner;

// Exercício 8 - Auxílio Combustível
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Você possui veículo próprio? (sim/nao): ");
         String resposta  = sc.nextLine();


        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Auxílio combustível disponível.");
        } else {
            System.out.println("Não possui auxílio combustível.");
        }
    }
}