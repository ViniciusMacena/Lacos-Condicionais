import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int operacao;
        float saldo=1000, saque, att= 0, depos;

        System.out.println("Selecione");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Deposito");

        System.out.println("Selecione uma operação:");
        operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.printf("O saldo da conta é: R$ %.2f", saldo);
                break;
            case 2:
                System.out.println("Insira o valor para saque: ");
                saque = sc.nextFloat();

                if (saldo<saque) {
                    System.out.printf("\n Saldo Insuficiente!");
                }else {
                    att=saldo-saque;
                    System.out.printf("\n Saldo disponivel : R$ %.2f",att);
                }
                break;
            case 3:
                System.out.println("\n Insira o valor para Deposito: ");
                depos = sc.nextFloat();
                att=saldo+depos;
                System.out.printf("\n Saldo disponivel : R$ %.2f",att);
                break;
            default:
                System.out.println("\nOperação Inválida!!");

        }

    }
}
