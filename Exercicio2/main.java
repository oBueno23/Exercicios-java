package Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<>();

        System.out.println("Bem-vindo à sua Biblioteca Pessoal!");

        while (true) {
            System.out.println("Digite os detalhes do livro ou 'sair' para encerrar:");

            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            if (titulo.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Ano de Publicação: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            Livro livro = new Livro(titulo, autor, ano);
            biblioteca.add(livro);

            System.out.println("Livro adicionado com sucesso!\n");
        }

        System.out.println("\nLivros na sua Biblioteca Pessoal:");
        for (Livro livro : biblioteca) {
            livro.exibirInfo();
            System.out.println();
        }

        scanner.close();
    }
}