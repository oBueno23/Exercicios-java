package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var estoque = new Estoque();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Produto");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Gerar Relatório de Estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o código do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarProduto(nome, codigo, preco, quantidade);
                    break;

                case 2:
                    System.out.print("Digite o código do produto a ser atualizado: ");
                    String codigoAtualizar = scanner.nextLine();
                    System.out.print("Digite o novo preço do produto: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.print("Digite a nova quantidade do produto: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarProduto(codigoAtualizar, novoPreco, novaQuantidade);
                    break;

                case 3:
                    System.out.print("Digite o código do produto a ser removido: ");
                    String codigoRemover = scanner.nextLine();
                    estoque.removerProduto(codigoRemover);
                    break;

                case 4:
                    estoque.gerarRelatorio();
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