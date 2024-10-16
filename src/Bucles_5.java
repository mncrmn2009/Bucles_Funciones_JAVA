import java.util.Scanner;

public class Bucles_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos empleados trabajan en su empresa?");
        int cantidadEmpleados = sc.nextInt();

        do {
            System.out.println("Cuantas horas trabajo el empleado " + cantidadEmpleados + "?");
            double horasTrabajadas = sc.nextDouble();

            System.out.println("El empleado " + cantidadEmpleados + " trabajo un total de " + horasTrabajadas);
            if (horasTrabajadas > 40){
                horasTrabajadas = horasTrabajadas - 40;
                System.out.println("El empleado "+ cantidadEmpleados + " hizo una cantidad de "+ horasTrabajadas + " horas extras");

            }
            cantidadEmpleados --;
        } while (cantidadEmpleados > 0);
    }
}