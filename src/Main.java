import java.util.Scanner;

// Nivel 2 - Exercicio 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a sua nota de 0 a 10: ");
        double nota  = sc.nextDouble();

        boolean cond1 = ((nota >= 7.5) && (nota <= 10));
        boolean cond2 = ((nota >= 6) && (nota <= 7.5));
        boolean cond3 = ((nota >= 5) && (nota <= 6));


        if ( cond1 ) {
            System.out.println("Nota Excelente.");
        }else if (cond2){
            System.out.println("Nota Boa.");
        }else if (cond3){
        System.out.println("Nota Regular.");
        }else if (nota>10){
            System.out.println("Valor incorreto.");
        }else {
        System.out.println("Reprovado.");
    }
    }
    }