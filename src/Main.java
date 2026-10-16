package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 5: Função para Calcular a Média de Três Notas

public class Main {
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = entrada.nextDouble();

        double media = calcularMedia(n1, n2, n3);
        System.out.println("A média é: " + media);

    }
}