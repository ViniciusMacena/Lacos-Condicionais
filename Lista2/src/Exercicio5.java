import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade,codigo;
        float valorTotal;

        System.out.println("\nLanchonete Macena");
        System.out.println("\nMenu de produtos");
        System.out.println("\n1 - Cachorro Quente - R$ 10,00");
        System.out.println("\n2 - X-Salada - R$ 15,00");
        System.out.println("\n3 - X-Bacon - R$ 18,00");
        System.out.println("\n4 - Bauru - R$ 12,00");
        System.out.println("\n5 - Refrigerante - R$ 8,00");
        System.out.println("\n6 - Suco de Laranja - R$ 13,00");
        System.out.println("\nEscolha o seu produto:");
        codigo = sc.nextInt();
        System.out.println("\nDigite a quantidade deste produto: ");
        quantidade = sc.nextInt();

        switch(codigo) {
            case 1:
                valorTotal = quantidade * 10;
                System.out.println("\nCachorro Quente - Valor Total: R$ "+valorTotal);
                break;
            case 2:
                valorTotal = quantidade * 15;
                System.out.println("\nX-Salada - Valor Total: R$ "+valorTotal);
                break;
            case 3:
                valorTotal = quantidade * 18;
                System.out.println("\nX-Bacon - Valor Total: R$ "+valorTotal);
                break;
            case 4:
                valorTotal = quantidade * 12;
                System.out.println("\nBauru - Valor Total: R$ "+valorTotal);
                break;
            case 5:
                valorTotal = quantidade * 8;
                System.out.println("\nRefrigerante - Valor Total: R$ "+valorTotal);
                break;
            case 6:
                valorTotal = quantidade * 13;
                System.out.println("\nSuco de Laranja - Valor Total: R$ "+valorTotal);
                break;
            default:
                System.out.println("\nCódigo Inválido!!!");
        }




    }
}
