import java.util.Scanner;

//Nivel 4 - Exercicio 3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite o valor da hora trabalhada: ");
        int n1 = sc.nextInt ();
        System.out.print("agora diga quantas horas foram trabalhadas nesse mês: ");
        int n2 = sc.nextInt ();
        int n3 = n1*n2;
        System.out.println("Seu salário este mês é de R$ " + n3 + ",00");
    }
}
