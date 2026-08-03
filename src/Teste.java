package teste;
import java.io.IOException;
import java.util.Scanner;

public class Teste
{
    public static void cls() throws IOException, InterruptedException { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();}

    public static void main(String[] args) throws IOException, InterruptedException
    {
        int menu;
        float saque;
        float deposito;
        boolean sair = false;
        float saldo =0;


        Scanner scanner = new Scanner(System.in);


        while (!sair)
        {

            System.out.println("\nBem-vindo\nescolha uma opção\n1 - Sacar\n2 - Depositar\n3 - ver Saldo\n0 - Sair");
            menu = scanner.nextInt();

            switch (menu)
            {
                case 0:
                    System.out.println("caixa finalizado");
                    sair = true;
                    break;

                case 1:
                    System.out.println("Insira o valor que deseja sacar");
                    saque = scanner.nextFloat();
                    if(saque > saldo || saque < 0 )
                    {
                        System.out.println("voce nao pode realizar essa operação");
                    }else
                    {
                        saldo -= saque;
                        System.out.println("seu novo saldo é " + saldo);
                    }
                    break;

                case 2:
                    System.out.println("insira o valor do deposito");
                    deposito = scanner.nextFloat();
                    if (deposito < 0)
                    {
                        System.out.println("voce nao pode realizar essa operação");
                    }else
                    {
                        saldo += deposito;
                        System.out.println("DEPOSITO REALIZADO R$" + saldo);
                    }
                    break;

                case 3:
                    System.out.printf("seu saldo é %.2f%n", saldo);
                    break;

                default:
                    System.out.println("opção invalida");
                    break;
            }


        }
        scanner.close();
    }
}