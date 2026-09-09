import java.util.Scanner;

//Nivel 3 - Exercicio 3
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("dê o valor do lado (m)");
    double base= sc.nextDouble ();
    double area = base * base;
    System.out.println ("area do quadrado\n" + area + " m²");
}
}

