import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println("Calculadora");

        Scanner sc = new Scanner(System.in);
        Boolean continuar = true;

        while(continuar){
            System.out.println("Primeiro número:");
            int numero1 = sc.nextInt();

            System.out.println("Segundo número:");
            int numero2 = sc.nextInt();

            System.out.printf("Qual operação?\n 1- Somar\n 2- Subtrair\n 3- Multiplicar\n 4- Dividir\n 0- Encerrar\n");
            int operacao = sc.nextInt();

            if (operacao == 0) {
                System.out.println("Encerrando calculadora...");
                break;
            }

            System.out.print("Resultado: ");
            switch (operacao){
                case 1:
                    somar(numero1, numero2);
                    break;
                case 2:
                    subtrair(numero1, numero2);
                    break;
                case 3:
                    multiplicar(numero1, numero2);
                    break;
                case 4:
                    dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Deseja continuar? S/N");
            String opcao = sc.next();

            if (opcao.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
    }
    static void somar(int x, int y){
        System.out.println(x + y);
    }
    static void subtrair(int x, int y){
        System.out.println(x - y);
    }
    static void multiplicar(int x, int y){
        System.out.println(x * y);
    }
    static void dividir(int x, int y){
        if (y == 0){
            System.out.println("Erro! Divisão por zero");
        } else {
            System.out.println(x / y);
        }
    }
}
