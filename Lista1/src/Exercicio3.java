import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        boolean primeiraDoacao;

        System.out.println("Digite o nome do doador: ");
        nome = sc.nextLine();

        System.out.println("Digite a idade do doador: ");
        idade = sc.nextInt();

        System.out.println("Primeira Doação de sangue? ");
        primeiraDoacao = sc.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69 && primeiraDoacao) {
                System.out.println(nome + ", você não está apto para doar sangue");
            } else {
                System.out.println(nome + ", você está apto para doar sangue");
            }
             } else{
                System.out.println(nome + ", você não está apto para doar sangue");
            }
        }


    }

