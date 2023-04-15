import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome,funcao;
        int cargo;
        double salario;

        System.out.printf("Nome Colaborador: ");
        nome = sc.nextLine();
        System.out.printf("Salario: R$ ");
        salario = sc.nextDouble();


        System.out.println("Cargos");
        System.out.println("1 - Gerente - 10%");
        System.out.println("2 - Vendedor - 7%");
        System.out.println("3 - Surpervisor - 9%");
        System.out.println("4 - Motorista - 6%");
        System.out.println("5 - Estoquista - 5%");
        System.out.println("6 - Tecnico de TI - 8%\n");

        System.out.printf("Informe seu cargo: ");
        cargo = sc.nextInt();

        switch (cargo){
            case 1:
                funcao = "Gerente";
                salario = salario + (salario * 0.10);
                System.out.println(nome + " || Cargo: " + funcao + " || Salario com reajuste R$ " + salario);
                break;
            case 2:
                funcao = "Vendedor";
                salario = salario + (salario * 0.07);
                System.out.println(nome + " || Cargo: " + funcao + " || Salario com reajuste R$ " + salario);
                break;
            case 3:
                funcao = "Surpervisor";
                salario = salario + (salario * 0.09);
                System.out.println(nome + " || Cargo: " + funcao + " || Salario com reajuste R$ " + salario);
                break;
            case 4:
                funcao = "Motorista";
                salario = salario + (salario * 0.06);
                System.out.println(nome + " || Cargo: " + funcao + " || Salario com reajuste R$ " + salario);
                break;
            case 5:
                funcao = "Estoquista";
                salario = salario + (salario * 0.05);
                System.out.println(nome + " || Cargo: " + funcao + " || Salario com reajuste R$ " + salario);
                break;
            case 6:
                funcao = "Tecnico de TI";
                salario = salario + (salario * 0.08);
                System.out.println(nome + " || Cargo: " + funcao + " || Salario com reajuste R$ " + salario);
                break;
            default:
                System.out.println("Selecione item da correto!!!");
        }







    }
}
