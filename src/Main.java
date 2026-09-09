import java.util.Scanner;

//Nivel 5 - Exercicio 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("digite a altura [m]: ");
        double alt = sc.nextDouble ();
        System.out.print("altura em metros: " + alt + "\naltura em centimetros: " + (alt * 100) + "\naltura em milimetros: " + (alt * 1000));
    }
}