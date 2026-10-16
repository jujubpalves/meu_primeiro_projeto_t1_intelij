package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 2: Função que Soma Dois Números

public class Main {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        int resultado = somar(n1, n2);
        System.out.println("A soma é: " + resultado);
    }
}