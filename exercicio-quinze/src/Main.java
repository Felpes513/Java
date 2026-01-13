import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota de N1");
        int n1 = scanner.nextInt();

        System.out.println("Digite sua nota de N2");
        int n2 = scanner.nextInt();

        double media = (n1 + n2) / 2;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}