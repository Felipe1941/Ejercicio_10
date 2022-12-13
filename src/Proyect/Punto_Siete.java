package Proyect;

import java.util.Scanner;

public class Punto_Siete {
    public static void main(String[] args) {
        division();

    }

    public static int division() throws ArithmeticException {
        int resultado = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Coloque dos numeros: ");
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();

            resultado = numero1 / numero2;

            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }

        return resultado;
    }
}
