package org.example;

import java.util.Scanner;

// Exercicios de estrutura de decisão

// Exercício 13 - E Detecção de Transação Suspeita

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da transação (R$):");

        double valorTransacao = entrada.nextDouble();

        if (valorTransacao > 10000) {

            System.out.println("Alerta: Transação suspeita! Sinalizada para análise.");

        } else {

            System.out.println("Transação normal aprovada.");

        }

    }

}
