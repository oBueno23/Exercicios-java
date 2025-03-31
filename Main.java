import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Digital!");

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int operacao = scanner.nextInt();
        String resultado;

        switch (operacao) {
            case 1:
                resultado = String.valueOf(Calculadora.adicionar(num1, num2));
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = String.valueOf(Calculadora.subtrair(num1, num2));
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = String.valueOf(Calculadora.multiplicar(num1, num2));
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = Calculadora.dividir(num1, num2);
                System.out.println("Resultado da divisão: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}
