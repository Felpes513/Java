public class Main{
    public static void main(String[] args){

        int idade = 20;
        boolean temCarteirinha = true;

        System.out.println("Pode pagar meia " + (idade <= 21 || temCarteirinha == true));
    }
}