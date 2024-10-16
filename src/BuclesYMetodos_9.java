import java.util.Scanner;

public class BuclesYMetodos_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] preciosOriginales = new double[5];


        System.out.println("Ingrese los precios originales de los productos:");

        for (int i = 0; i < preciosOriginales.length; i++) {
            System.out.print("Precio del producto " + (i + 1) + ": ");
            preciosOriginales[i] = scanner.nextDouble();
        }


        System.out.println("\nPrecios finales después de aplicar el descuento:");
        for (int i = 0; i < preciosOriginales.length; i++) {
            double precioFinal = calcularPrecioFinal(preciosOriginales[i]);
            System.out.printf("Producto %d: Precio original: %.2f, Precio final: %.2f\n", (i + 1), preciosOriginales[i], precioFinal);
        }


    }

    public static double calcularPrecioFinal(double precioOriginal) {
        final double DESCUENTO = 0.10;
        return precioOriginal - (precioOriginal * DESCUENTO);
    }
}