import java.util.Scanner;

//Nivel 4 - Exercicio 5
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite o valor de A: ");
        double n1 = sc.nextDouble ();
        double n3 = n1;
        System.out.print("digite o valor de B: ");
        double n2 = sc.nextDouble ();
        n1 = n2;
        System.out.println("O valor de A foi atualizado para o valor de B: " + n1);n2 = n3;2
        System.out.println("O valor de B foi atualizado para o valor de A: " + n2);
    }
}
