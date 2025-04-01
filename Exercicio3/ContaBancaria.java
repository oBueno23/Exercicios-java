package Exercicio3;

public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private int saldo;

    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("Valor de saque deve ser positivo.");
        }
    }

    public int consultarSaldo() {
        return saldo;
    }

    public void exibirInfo() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo Atual: R$ " + saldo);
    }
}