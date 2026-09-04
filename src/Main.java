import java.util.Scanner;

// Exercício 10 - Aprovação de Empréstimo Pessoal
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: ");
        double salario  = sc.nextDouble();
        System.out.print("Digite o valor da parcela: ");
        double parcela  = sc.nextDouble();


        if ( parcela <= salario * 0.30 ) {
            System.out.println("Empréstimo aprovado.");
        }else{
            System.out.println("Empréstimo não aprovado.");
        }
    }
}