package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;


class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, String codigo, double preco, int quantidade) {
        Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
        produtos.add(novoProduto);
        System.out.println("Produto adicionado com sucesso.");
    }

    public void atualizarProduto(String codigo, double novoPreco, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produto.atualizarPreco(novoPreco);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void removerProduto(String codigo) {
        boolean removido = produtos.removeIf(produto -> produto.getCodigo().equals(codigo));
        if (removido) {
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void gerarRelatorio() {
        if (produtos.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Relatório de Estoque:");
            double valorTotal = 0;
            for (Produto produto : produtos) {
                System.out.println(produto);
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
            System.out.printf("Valor total em estoque: R$ %.2f%n", valorTotal);
        }
    }
}