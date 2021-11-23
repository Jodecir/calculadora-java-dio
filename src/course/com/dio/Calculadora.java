package course.com.dio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        boolean fechado = false;
        String repetir;

        while (fechado == false) {
            System.out.println("Digite o primeiro valor: ");
            a = scan.nextInt();
            System.out.println("Digite o segundo valor: ");
            b = scan.nextInt();

            int somar = somar(a,b);
            int subtrair = subtrair(a,b);
            int multiplicar = multiplicar(a,b);
            int dividir = dividir(a,b);

            System.out.println("soma: " + somar);
            System.out.println("subtração: " + subtrair);
            System.out.println("multiplicação: " + multiplicar);
            System.out.println("divisão: " + dividir);

            System.out.println("Deseja continuar (s/n): ");
            repetir = scan.next();
            if (repetir == "n") {
                fechado = true;
            }
        }
    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
