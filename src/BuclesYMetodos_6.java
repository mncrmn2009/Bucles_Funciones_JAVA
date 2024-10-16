import java.util.Scanner;

public class BuclesYMetodos_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] facturas = new double[5];

        System.out.println("ingrese los montos de las facturas: ");

        for (int i= 0; i < facturas.length; i++) {
            System.out.println("Factura "+ (i+1) + ": ");
            facturas[i]= sc.nextDouble();
        }
        System.out.println("Impuesto de venta para cada factura: ");
        for (int i= 0; i < facturas.length; i ++) {
            double impuesto = calcularImpuestos(facturas[i]);
            System.out.printf("Factura %d: Monto: %.2f, Impuesto: %.2f\n", (i+1), facturas[i], impuesto );
        }
    }
    public static double calcularImpuestos (double monto) {

        double totalImpuestos= 0.21;
        return monto * totalImpuestos;
    }
}
