
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento");
        int anoNascimento = scanner.nextInt();

        System.out.println("Em que ano nós estamos?");
        int anoAtual = scanner.nextInt();

        int calculoDeIdade = anoAtual - anoNascimento;

        System.out.println("Em " + anoAtual + " você tem ou terá " + calculoDeIdade + " anos");

        scanner.close();
    }
}