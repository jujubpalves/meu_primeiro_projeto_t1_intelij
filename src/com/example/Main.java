
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers

public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:/Users/56576890893/Downloads/ativos.csv";
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length >= 3) {
                    String ip = dados[1];
                    String sistema = dados[2];
                    if (sistema.equalsIgnoreCase("Windows")) {
                        System.out.println("IPs Windows: " + ip);
                    }
                 }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}