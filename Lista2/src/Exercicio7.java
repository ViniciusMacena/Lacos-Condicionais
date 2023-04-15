import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double numero1, numero2,res;
        int operacao;

        System.out.printf("Digite o primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.printf("Digite o segundo numero: ");
        numero2 = sc.nextDouble();
        System.out.println("------------------");

        System.out.println("Calculadora");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão\n");

        System.out.println("Selecione uma operação: ");
        operacao = sc.nextInt();

        switch (operacao){
            case 1:
                res = numero1 + numero2;
                System.out.printf(numero1+" + "+numero2+" = "+res);
                break;
            case 2:
                res = numero1 - numero2;
                System.out.printf(numero1+" - "+numero2+" = "+res);
                break;
            case 3:
                res = numero1 * numero2;
                System.out.printf(numero1+" * "+numero2+" = "+res);
                break;
            case 4:
                res = numero1 / numero2;
                System.out.printf(numero1+" / "+numero2+" = "+res);
                break;
            default:
                System.out.println("Digite a operação certa! ");


        }




    }
}
