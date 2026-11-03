
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
//Desafio 2 - Contar Dispositivos
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:/Users/56576890893/Downloads/ativos.csv";
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length >= 3) {
                    String host = dados[0];
                    String sistema = dados[2];
                    if (sistema.equalsIgnoreCase("Linux")) {
                        System.out.println("Host Linux: " + host);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}