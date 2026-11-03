import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
//Desafio 2 - Contar Dispositivos
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:\\Users\\Downloads\\ativos.csv";
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int total = 0;

            while ((linha = leitor.readLine()) != null) {
                total++;
            }

            System.out.println("Total de dispositivos encontrados: " + total);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        }

    }
}