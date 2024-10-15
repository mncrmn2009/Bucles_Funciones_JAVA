import java.util.Scanner;

public class BuclesYMetodos_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] ventas;
        ventas = new double[30];
        for (int i = 0; i < 30; i++) {
            System.out.println("Cuantas ventas se realizaron durante el dia "+ (i+1));
            ventas[i] = sc.nextDouble();
        }
        double totalIngresos = calcularIngresosMensuales(ventas);
        System.out.println("Total de ingresos mensuales " + totalIngresos);
    }

    public static double calcularIngresosMensuales (double []ventaDiaria){

        double ingresosMensuales = 0;

        for (double venta: ventaDiaria){

            ingresosMensuales+=venta;


        }
        return ingresosMensuales;
    }


}
