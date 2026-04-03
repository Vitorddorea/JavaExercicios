import java.util.Scanner;
import java.util.ArrayList;

public class ParImpar {

    public static void main(String[] args) {

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int somaPar = 0;
        int somaImpar = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("NÚMEROS PARES");
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Digite um número positivo.");
            sc.close();
            return;
        }

        for (int i = 0; i <= num ; i ++) {
            if (i % 2 == 0) {
                pares.add(i);
                somaPar += i;
            }else {
                impares.add(i);
                somaImpar += i;
            }
        }
        System.out.println();
        System.out.println("Pares: " + pares);
        System.out.println("Quantidade Par: " + pares.size()); // o .size() retorna o tamanho do array
        System.out.println("Soma dos Pares: " + somaPar);

        System.out.println();

        System.out.println("Ímpares: " + impares);
        System.out.println("Quantidade Impar: " + impares.size());
        System.out.println("Soma dos Impares: " + somaImpar);

        sc.close();
    }
}

