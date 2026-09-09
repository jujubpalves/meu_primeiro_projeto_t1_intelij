import java.util.Scanner;

//Nivel 5 - Exercicio 5
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite o tempo em segundos: ");
        int seg = sc.nextInt ();

        int min = seg / 60;
        int hrs = min / 60;
        System.out.println("Resultado: " + hrs + " horas, " + (min % 60) +
                " minutos e " + (seg % 60) + " segundos.");
    }
}