import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerado = new Random();
        int sorteado = gerado.nextInt(100) + 1;
        int tentativa = 0;

        System.out.println("ADIVINHE O NÚMERO");

        while (true){

            System.out.println("Digite um número de 1 a 100: ");
            int num = sc.nextInt();

            if (num < 1 || num > 100){
                System.out.println("Digite um número dentro do intevalo de 1 a 100!");
                continue;
            }

            tentativa ++;

            if (num < sorteado){
                System.out.println("É Maior");
            }else if (num > sorteado){
                System.out.println("É Menor");
            }else {
                System.out.println("Acertou!");
                break;
            }
        }
        System.out.println("Você acertou em " + tentativa + " tentativa(s)");
        sc.close();
    }
}
