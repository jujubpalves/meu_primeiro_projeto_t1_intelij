package org.example;
import java.util.Scanner;

// Exercício 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();


        if (nota >= 9 ){
            System.out.println("Excelente");
        } else if(nota <= 7) {
            System.out.println("Bom");
        }

        if (nota >= 5 ){
            System.out.println("Regular");
        } else  {
            System.out.println("Insuficiente");
        }
    }