import java.util.Scanner;

//Estrtura de repetição
// Atividade 5 - Caixa de Supermercado
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorProduto, soma;
        String continuar;

        soma = 0;
        do {
            System.out.println("Informe o valor do produto");
            valorProduto = entrada.nextDouble();
            soma = soma + valorProduto;
            System.out.println("Continuar? (y)");

            entrada.nextLine();
            continuar = entrada.nextLine();
        }while (continuar.equals("y") || continuar.equals("y"));

        System.out.println("Total da Compra: " + soma);

    }
}