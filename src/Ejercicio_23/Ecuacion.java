package Ejercicio_23;

public class Ecuacion {
    private double a;
    private double b;
    private double c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolver() {
        if (a == 0) {
            return b == 0 ? (c == 0 ? "La ecuación tiene infinitas soluciones." : "La ecuación no tiene solución.") : 
                            "La solución es: x = " + (-c / b);
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            return "La ecuacion no tiene soluciones reales.";
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "La ecuacion tiene una solución doble: x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "La ecuacion tiene dos soluciones: x1 = " + x1 + ", x2 = " + x2;
        }
    }
}
