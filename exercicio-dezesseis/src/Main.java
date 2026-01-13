import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Bem vindo a calculadora");
        System.out.println("Opção 1 - Soma");
        System.out.println("Opção 2 - Subtração");
        System.out.println("Opção 3 - Multiplicação");
        System.out.println("Opção 4 - Sair");
        System.out.println("Escolha uma opção de 1 a 4");
        int menu = scanner.nextInt();

        System.out.println("Digite um número inteiro");
        int a = scanner.nextInt();

        System.out.println("Digite um número inteiro");
        int b = scanner.nextInt();

        switch (menu){
            case 1:
                System.out.println("O valor da soma é: " + (a + b));
                break;
            case 2:
                System.out.println("O valor da subtração é: " + (a - b));
                break;
            case 3:
                System.out.println("O valor da multiplicação é: " + (a * b));
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }

        scanner.close();
    }
}