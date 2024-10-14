import java.util.Scanner;

public class Bucles_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuandos empleados tiene su empresa?");
        int cantidadEmpleados = sc.nextInt();

        double tarifaPorHora = 15.0;

        for (int i= 1; i <= cantidadEmpleados; i++){
            System.out.print("Cuantas horas trabajo el empleado " + i + ": ");
            int horasTrabajadas = sc.nextInt();

            double salario = horasTrabajadas * tarifaPorHora;

            System.out.println("El salario del empleado " + i + " es de: $" + salario);
        }
    }
}
