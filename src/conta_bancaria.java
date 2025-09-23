
import java.util.Scanner;

public class conta_bancaria {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String nome;
        String tipoConta;
        double saldo=0, valor=0;
        int opcao=0;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("\t Digite o nome do usuário da conta: ");
        nome=e.next();

        System.out.println("\t Digite o tipo da conta do usuário:");
        tipoConta=e.next();

        System.out.println("\t Digite o saldo da conta:");
        saldo=e.nextDouble();

        System.out.println("-------------------------------------------------------------------");

        String menu = """
                --Digite sua opção
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        while(opcao !=4){
            System.out.println(menu);
            opcao=e.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O saldo atualizado é " + saldo);
                    break;
                case 2:
                    System.out.println("Qual valor deseja transferir? ");
                    valor=e.nextDouble();
                    if (valor>saldo){
                        System.out.println("Não há saldo para realizar a transferência!");
                    } else {
                        saldo=saldo-valor;
                        System.out.println("Novo saldo: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor recebido:");
                    valor=e.nextDouble();
                    saldo+=valor;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("opção inexistente");
                    break;
            }


        }





    }
}
