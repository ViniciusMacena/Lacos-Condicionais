import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;


        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0 && numero > 0) {
            System.out.println("O numero " + numero + " é par e positivo");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("O numero " + numero + " é par e negativo");
        } else if (numero % 2 != 0 && numero > 0) {
            System.out.println("O numero " + numero + " é impar e positivo");
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.println("O numero " + numero + " é impar e negativo");
        }
    }
}