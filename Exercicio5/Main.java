package Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        Carro carro = new Carro(marca, modelo, ano);

        carro.exibirInformacoes();

        System.out.print("Digite a quantidade para acelerar (km/h): ");
        double acelerar = scanner.nextDouble();
        carro.acelerar(acelerar);

        System.out.print("Digite a quantidade para frear (km/h): ");
        double frear = scanner.nextDouble();
        carro.frear(frear);

        carro.exibirInformacoes();

        scanner.close();
    }
}