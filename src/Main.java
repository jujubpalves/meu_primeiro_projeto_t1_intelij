package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 3: Função para Calcular o Dobro de um Número

public class Main {
    public static int dobrar(int num) {
        return num * 2 ;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = entrada.nextInt();
        System.out.println("O dobro do valor é: " + dobrar(num));

    }
}