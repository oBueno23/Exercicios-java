package Exercicio1;

public class Calculadora {

    public static int adicionar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static String dividir(int a, int b) {
        if (b == 0) {
            return "Divisão por zero não é permitida.";
        }
        return String.valueOf(a / b);
    }
}