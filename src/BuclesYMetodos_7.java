import java.util.Scanner;

public class BuclesYMetodos_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] compras = new double[5];

        System.out.println("Ingrese los montos de las compras de los clientes: ");

        for (int i = 0; i < compras.length; i++) {
            System.out.println("Compra "+ (i+1) + ": ");
            compras[i] = sc.nextDouble();
        }
        System.out.println("\nMontos despues de aplicar el descuento (si la compra es superior a 500$");
        for (int i = 0; i < compras.length; i ++){

            double montoFinal = aplicarDescuento (compras[i]);
            System.out.printf("Compra %d: Monto original: %.2f, Monto final: %.2f \n", (i+1), compras[i], montoFinal);
        }
    }
    public static double aplicarDescuento (double monto) {
        double descuento = 0.15;
        double limiteDescuento = 500.00;

        if (monto > limiteDescuento){
            return monto - (monto * descuento);
        }
        return monto;
    }
}
