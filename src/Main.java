package org.example;
import java.util.Scanner;

// Exercicios de estrutura de decisão
// Exercício 11 - Classificação de Clientes por Investimento

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor investido pelo cliente (R$):");
        double investimento = entrada.nextDouble();

        if (investimento <= 10000) {
            System.out.println("Classificação do cliente: Bronze");
        } else if (investimento <= 50000) {
            System.out.println("Classificação do cliente: Prata");
        } else if (investimento <= 100000) {
            System.out.println("Classificação do cliente: Ouro");
        } else {
            System.out.println("Classificação do cliente: Platinum");
        }
    }
}