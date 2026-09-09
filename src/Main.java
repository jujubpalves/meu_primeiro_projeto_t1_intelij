import java.util.Scanner;

//Nivel 3 - Exercicio 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fale a temperatura em °C");
        double celsius= sc.nextDouble ();
        double faren = (celsius*9/5) + 32;
        System.out.println ("temperatura em farenheit\n" + faren + " °F");
    }
}

