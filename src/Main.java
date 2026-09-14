//Estrtura de repetição
// Exercício 3 - Soma de Vendas do Diaa
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        for (int venda = 1; venda <= 5; venda++) {
            System.out.println("Digite o valor da venda " + venda);
            double valor = entrada.nextDouble();
            total += valor;
        }
        System.out.println("Faturamento total do dia: R$ " + total);
    }
}