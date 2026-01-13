import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("É positivo");
        } else if (numero < 0) {
            System.out.println("É negativo");
        }else {
            System.out.println("Esse número é zero");
        }
    }
}