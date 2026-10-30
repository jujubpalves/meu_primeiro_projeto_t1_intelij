package com.example;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C://Users//56576890893.SESISENAI//Downloads//ativos.csv";
        BufferedReader leitor =
                new BufferedReader(
                        new FileReader(arquivo));
        String linha;
        leitor.readLine();
        while((linha = leitor.readLine()) != null){

            String[] dado = linha.split(",");

            String host = dado[0];
            String ip = dado[1];
            String sistema = dado[2];

            System.out.println("Host: " + host);
            System.out.println("IP: " + ip);
            System.out.println("Sistema: " + sistema);

        }

    }
}