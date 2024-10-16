import java.util.Scanner;

public class Bucles_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ventasDia = 1;
        int totalVentas = 0;

        while (ventasDia <= 7) {
            System.out.println("Cuantas ventas se realizaron durante el dia " + ventasDia);
            int cantidadVentas = sc.nextInt();
            System.out.println("Se realizaron " + cantidadVentas + " ventas durante el dia " + ventasDia );
            totalVentas += cantidadVentas;
            ventasDia ++;
        }
        System.out.println("Se realizaron durante la semana un total de: " + totalVentas + " Ventas");
    }

}