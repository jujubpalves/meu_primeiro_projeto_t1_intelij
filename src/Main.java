import java.util.Scanner;

//Nivel 4 - Exercicio
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do real:");
        double real= sc.nextDouble ();

        double dolar = real*0.1941;


        System.out.println ("valor do real convertido em dolar:\n" + "U$" +
                dolar );
    }
}


