package Exercicio6;

import Exercicio6.Contato;

import java.util.ArrayList;

public class Agenda {
    public String getNome() {
        return null;
    }

    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone, String email) {
        Contato novoContato = new Contato(nome, telefone, email);
        contatos.add(novoContato);
        System.out.println("Contato adicionado com sucesso.");
    }

    public void removerContato(String nome) {
        boolean removido = contatos.removeIf(Contato -> Contato.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void buscarContato(String nome) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome))
            {
                System.out.println("Contato encontrado: " + contato);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }

    public void mostrarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Contatos na agenda:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}