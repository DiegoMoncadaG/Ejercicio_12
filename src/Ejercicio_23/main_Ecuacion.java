package Ejercicio_23;

import java.util.Scanner;

public class main_Ecuacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        Ecuacion ecuacion = new Ecuacion(a, b, c);
        String resultado = ecuacion.resolver();

        System.out.println(resultado);
    }
}
