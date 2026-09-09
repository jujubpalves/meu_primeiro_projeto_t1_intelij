import java.util.Scanner;

//Nivel 4 - Exercicio 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite o valor do raio [cm]: ");
        double n1 = sc.nextDouble ();

        double pi = 3.14;
        double A = pi*(n1*n1);
        System.out.println("\nA área do círculo é de " + A + "cm²");
        System.out.println("\nEm metros, " + A/10000 + "m²\n");
    }
}