import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        System.out.println("Entre com a primeira palavra:");
        palavra1 = sc.nextLine();

        System.out.println("Entre com a segunda palavra:");
        palavra2 = sc.nextLine();

        System.out.println("Entre com a terceira palavra:");
        palavra3 = sc.nextLine();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("É uma Águia");
                } else {
                    System.out.println("É uma Pomba");
                }
            } else {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("É um Ser Humano");
                } else {
                    System.out.println("É uma Vaca");
                }
            }
        } else {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if(palavra3.equalsIgnoreCase("hematofago")){
                System.out.println("É uma Pulga");
            } else {
                System.out.println("É uma Lagarta");
            }
        }else{
                if (palavra3.equalsIgnoreCase("hematofago")){
                    System.out.println("Né uma Sanguessuga");
                }else {
                    System.out.println("É uma Minhoca");
                }
            }

        }

    }
}
