package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public String toString() {
        return "Produto: " + nome + ", Código: " + codigo + ", Preço: R$ " + preco + ", Quantidade: " + quantidade;
    }
}