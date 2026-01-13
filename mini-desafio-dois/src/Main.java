import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade");
        int idade = scanner.nextInt();

        System.out.println((idade >= 18) + " Você tem carteirinha?");
        boolean temCarteirinha = scanner.nextBoolean();

        boolean podePassar = temCarteirinha && (idade >= 18);

        System.out.println((temCarteirinha == true) + " Pode passar");
        System.out.println("Pode passar " + podePassar);

        scanner.close();
    }
}