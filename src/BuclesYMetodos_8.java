import java.util.Scanner;
public class BuclesYMetodos_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmpleados = 3;

        String[] empleados = new String[numEmpleados];
        double[] horasTrabajadas = new double[numEmpleados];

        System.out.println("Ingrese los nombres de los empleados:");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
        }

       System.out.println("\nIngrese las horas trabajadas por cada empleado:");
       for (int i = 0; i < numEmpleados; i++) {
           System.out.print("Horas trabajadas por " + empleados[i] + ": ");
           horasTrabajadas[i] = sc.nextDouble();
       }

       System.out.println("\nPagos semanales:");
       for (int i = 0; i < numEmpleados; i++) {
          double pagoSemanal = calcularPagoSemanal(horasTrabajadas[i]);
          System.out.printf("Empleado: %s, Pago semanal: $%.2f\n", empleados[i], pagoSemanal);

    }

}
    public static double calcularPagoSemanal (double horas) {
        final double tarifaPorHora = 15.00;
        return horas * tarifaPorHora;
}
}