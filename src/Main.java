import java.util.Scanner;

//Atividade 1 - Controle de Entrada em Evento
public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       for (int i = 1; i <= 10; i++){
           System.out.print("Digite o nome do participante " + i + ": ");
           String nome = scanner.nextLine();

           System.out.println(" Participante " + nome + " registrado  com sucesso!");
       }
    }
}