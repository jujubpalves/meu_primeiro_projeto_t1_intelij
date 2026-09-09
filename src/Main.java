import java.util.Scanner;

//Nivel 5 - Exercicio 3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite seu peso [kg]: ");
        int n1 = sc.nextInt ();

        System.out.print("digite a altura [m]: ");
        int n2 = sc.nextInt();
        int n3 = n1/n2;
        System.out.println("Resultado: " + n3 + "\n resto da divisão: " +
                n1%n2);
    }
}