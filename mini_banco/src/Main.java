import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instâncias de bibliotecas.
        Scanner l = new Scanner(System.in);

        // Variáveis do usuário.
        String nameClient = "Lucas Gabriel Gomes de Oliveira";
        String accountType = "Conta-Corrente";
        double openingBalance = 2500.00;
        double receiveValue = 0;
        double transfererValue = 0;

        // Variáveis do sistema.
        int option = 0;

        System.out.println("Operações: ");
        System.out.println(" ");
        System.out.println("|1| Consultar saldo");
        System.out.println("|2| Receber valor");
        System.out.println("|3| Transferir valor");
        System.out.println("|3| Sair");
        System.out.println(" ");

        while(option != 4) {
            System.out.println("Digite a opção desejada: ");
            option = l.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Opção |1|");
                    System.out.println(String.format("O seu saldo é de R$ %.2f", openingBalance));
                    break;
                case 2:
                    System.out.println("Opção |2|");
                    System.out.println("Informe o valor a que deseja receber: ");
                    receiveValue = l.nextDouble();
                    openingBalance += receiveValue;
                    System.out.println(String.format("O seu saldo agora é de: R$ %.2f", openingBalance));
                    break;
                case 3:
                    System.out.println("Opção |3|");
                    System.out.println("Informe o valor a que deseja transferir: ");
                    transfererValue = l.nextInt();
                    if(transfererValue > openingBalance) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        openingBalance -= transfererValue;
                        System.out.println(String.format("O seu saldo agora é de: R$ %.2f", openingBalance));
                    }
                    break;
                case 4:
                    System.out.println("Opção |4|");
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        l.close();
    }
}