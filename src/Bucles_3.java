import java.util.Scanner;

public class Bucles_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos productos hay en el inventario?");
        int cantidadProductos = sc.nextInt();

        while (cantidadProductos> 0) {

            System.out.print("Que cantidad hay del producto numero " + cantidadProductos + ": ");
            int stockProductos = sc.nextInt();



            if (stockProductos < 5) {
                System.out.println("Es necesario pedir mas cantidad del producto " + cantidadProductos);
            }
            cantidadProductos = --cantidadProductos;
            }


        }
    }

