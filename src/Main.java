import java.util.Scanner;

// Exercício 6 - Direito ao Vale Refeição
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();


        if (salario <= 4000) {
            System.out.println("Você possui direito ao VR.");
        } else {
            System.out.println("Você não possui direito ao VR.");
        }
    }
}