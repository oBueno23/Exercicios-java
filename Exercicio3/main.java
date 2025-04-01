package Exercicio3;

import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Bancário!");

        // Coletar informações da conta
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        // Criar uma nova conta bancária
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Exibir Informações da Conta");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    int valorDeposito = scanner.nextInt();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    int valorSaque = scanner.nextInt();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo Atual: R$ " + conta.consultarSaldo());
                    break;
                case 4:
                    conta.exibirInfo();
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}