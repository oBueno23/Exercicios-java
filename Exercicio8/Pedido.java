package Exercicio8;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;

    public Pedido(String enderecoEntrega) {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = enderecoEntrega;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        System.out.println("Pizza " + pizza.getNome() + " adicionada ao pedido.");
    }

    public void cancelarPedido() {
        pizzas.clear();
        System.out.println("Pedido cancelado.");
    }

    public void gerarRelatorio() {
        if (pizzas.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
            return;
        }

        System.out.println("\nRelatório do Pedido:");
        double total = 0;
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
            total += pizza.getPreco();
        }
        System.out.printf("Total de Pedidos: %d\n", pizzas.size());
        System.out.printf("Valor Total: R$ %.2f\n", total);
        System.out.printf("Média de Preço dos Pedidos: R$ %.2f\n", total / pizzas.size());
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
    }
}