//Este exercicio tem como objetivo prosseguir com o meu desenvolvimento em lógica de programação, agora aplicando entradas e saídas

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = scanner.nextLine();

        System.out.println("Informe sua cidade");
        String cidade = scanner.nextLine();

        System.out.println("Informe a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Meu nome é " + nome + " e moro em " + cidade);
        System.out.println("Minha idade é: " + idade + " anos");
        scanner.close();
    }
}