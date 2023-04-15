import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C,soma;

        System.out.println("Digite o numero A: ");
        A = sc.nextInt();

        System.out.println("Digite o numero B: ");
        B = sc.nextInt();

        System.out.println("Digite o numero C: ");
        C = sc.nextInt();

        soma = A + B;
        System.out.println("A soma de A + B = " + soma);

        if (A + B > C){
            System.out.println("A soma de A + B é maior que C");
        } else if (A + B < C) {
            System.out.println("A soma de A + B é menor que C");
        } else if (A + B == C) {
            System.out.println("A soma de A + B é igual que C");
        }


    }
}

