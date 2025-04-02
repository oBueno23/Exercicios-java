package Exercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando algumas pizzas disponíveis
        List<Pizza> menuPizzas = new ArrayList<>();
        menuPizzas.add(new Pizza("Margherita", 25.00, "Molho de tomate, queijo, manjericão"));
        menuPizzas.add(new Pizza("Pepperoni", 30.00, "Molho de tomate, queijo, pepperoni"));
        menuPizzas.add(new Pizza("Quatro Queijos", 35.00, "Queijo muçarela, queijo gorgonzola, queijo parmesão, queijo provolone"));
        menuPizzas.add(new Pizza("Frango com Catupiry", 32.00, "Frango desfiado, catupiry, queijo muçarela"));

        System.out.print("Digite o endereço de entrega: ");
        String enderecoEntrega = scanner.nextLine();
        Pedido pedido = new Pedido(enderecoEntrega);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Pizza ao Pedido");
            System.out.println("2 - Cancelar Pedido");
            System.out.println("3 - Gerar Relatório do Pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Pizzas disponíveis:");
                    for (int i = 0; i < menuPizzas.size(); i++) {
                        System.out.println((i + 1) + " - " + menuPizzas.get(i));
                    }
                    System.out.print("Escolha o número da pizza que deseja adicionar: ");
                    int escolhaPizza = scanner.nextInt();
                    if (escolhaPizza > 0 && escolhaPizza <= menuPizzas.size()) {
                        pedido.adicionarPizza(menuPizzas.get(escolhaPizza - 1));
                    } else {
                        System.out.println("Escolha inválida.");
                    }
                    break;

                case 2:
                    pedido.cancelarPedido();
                    break;

                case 3:
                    pedido.gerarRelatorio();
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