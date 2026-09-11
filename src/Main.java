package org.example;

import java.util.Scanner;

// Exercicios de estrutura de decisão

// Exercício 14 - Concessão de Isenção de Tarifas

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o saldo médio mensal do cliente (R$):");

        double saldo = entrada.nextDouble();

        if (saldo > 5000) {

            System.out.println("Direito à isenção de tarifa bancária concedido.");

        } else {

            System.out.println("Tarifa bancária mantida. É necessário saldo superior a R$ 5.000 para isenção.");

        }

    }

}
