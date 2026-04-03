import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        int quantidade = 0;
        int somaPares = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("NÚMEROS PARES");
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Digite um número positivo.");
            return;
        }

        System.out.print("Pares: ");
        for (int i = 0; i <= num ; i +=2){
            System.out.print(i + " ");
            quantidade += 1;
            somaPares += i;
        }

        System.out.println();
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Soma: " + somaPares);

        sc.close();
    }
}
