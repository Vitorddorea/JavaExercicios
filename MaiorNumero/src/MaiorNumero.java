import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MAIOR NÚMERO");

        System.out.println("Digite um número: ");
        int menor = sc.nextInt();
        int maior = menor;
        int soma = menor;

        for (int i = 1; i < 5 ; i++ ){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
            soma += num;
        }

        double media = soma / 5.0;

        System.out.println("O maior número digitado foi " + maior + " e o menor foi " + menor);
        System.out.println("A média entre os números foi " + media);
        sc.close();
    }
}
