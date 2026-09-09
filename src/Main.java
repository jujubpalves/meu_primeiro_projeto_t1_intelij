import java.util.Scanner;

//Nivel 4 - Exercicio 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("diga quantos kilometros o carro consegue percorrer com o tanque cheio: ");
        int n1 = sc.nextInt();
        System.out.print("agora diga quantos litros tem o tanque: ");
        int n2 = sc.nextInt();
        int n3 = n1 / n2;
        System.out.println("Seu carro faz " + n3 + " Km/l de combustivel");

    }
}

