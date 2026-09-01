package org.example;
import java.util.Scanner;

// Exercício 1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();


        if (nota >= 7 ){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
