package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre FUNÇÕES
//Exercício 4: Função para Converter Graus Celsius para Fahrenheit

public class Main {
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32 ;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em celsius que deseja converter: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println("O valor em Fahrenheit é: " + fahrenheit);

    }
}