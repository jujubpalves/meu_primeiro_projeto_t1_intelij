import java.util.Scanner;

//Nivel 5 - Exercicio 1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite seu peso [kg]: ");
        double peso = sc.nextDouble ();

        System.out.print("digite sua altura [m]: ");
        double alt = sc.nextDouble ();
        double IMC = peso / (alt * alt);
        System.out.println("Seu IMC é: " + IMC);
    }
}
