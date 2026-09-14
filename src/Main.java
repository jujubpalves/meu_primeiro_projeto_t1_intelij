import java.util.Scanner;

//Estrtura de repetição
// Atividade 4 - Pesquisa de Satisfação
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notaSatisfacao = 0;
        int qtdCliente = 0;

        System.out.println("Informe a sua nota: ");

        while (qtdCliente < 10) {
            qtdCliente++;
            System.out.println("Cliente " +  qtdCliente + ", informe a sua nota: ");
            notaSatisfacao = entrada.nextInt();


        }
        System.out.println("Quantidade de clientes participantes " + qtdCliente);
    }
}