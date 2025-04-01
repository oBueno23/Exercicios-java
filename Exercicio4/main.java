package Exercicio4;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Jogadores!");

        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine();

        Jogador jogador = new Jogador(nomeJogador);

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Aumentar Pontuação");
            System.out.println("2. Exibir Informações do Jogador");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de pontos a ser adicionada: ");
                    int pontos = scanner.nextInt();
                    jogador.aumentarPontuacao(pontos);
                    break;
                case 2:
                    jogador.exibirInfo();
                    break;
                case 3:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}