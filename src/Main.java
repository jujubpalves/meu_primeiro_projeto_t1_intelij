package org.example;
import java.util.Scanner;

// Exercicios de estrutura de decisão
// Exercício 12 - Elegibilidade para Cartão Premium

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a renda mensal do cliente (R$):");
        double renda = entrada.nextDouble();

        System.out.println("Digite o score de crédito do cliente:");
        int score = entrada.nextInt();

        if (renda > 8000 && score > 700) {
            System.out.println("Cartão Premium aprovado!");
        } else {
            System.out.println("Cartão Premium negado. É necessário ter renda acima de R$ 8.000 e score acima de 700.");
        }
    }
}