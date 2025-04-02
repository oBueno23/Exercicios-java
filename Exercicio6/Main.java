package Exercicio6;
import Exercicio6.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Mostrar Todos os Contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Digite o email do contato: ");
                    String email = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone, email);
                    break;

                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 3:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBusca = scanner.nextLine();
                    agenda.buscarContato(nomeBusca);
                    break;

                case 4:
                    agenda.mostrarContatos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}