import java.util.Scanner;

//Nivel 3 - Exercicio 1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor, diga sua nota de ingles (10 a 0)");
        double nota1= sc.nextDouble ();
        System.out.println("por favor, diga sua nota de matemática (10 a 0)");
        double nota2= sc.nextDouble ();
        System.out.println("por favor, diga sua nota de portugues (10 a 0)");
        double nota3= sc.nextDouble ();
        double media = (nota1 + nota2 + nota3)/ 3;
        System.out.println ("média:\n" + media);
    }
}
