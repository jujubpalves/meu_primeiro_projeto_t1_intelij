import java.util.Scanner;

//Nivel 5 - Exercicio 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite seu captital inicial: ");
        double capital = sc.nextDouble ();

        System.out.print("digite a taxa de juros [decimal]: ");
        double taxa = sc.nextDouble();
        System.out.print("digite o tempo [meses]: ");
        double tempo = sc.nextDouble();
        double juros = capital * taxa * tempo;
        System.out.println("Resultado: " + juros);
    }
}