import java.util.Scanner;

public class BuclesYMetodos_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] calificaciones = new int[10];
        for (int i = 0; i < calificaciones.length; i++) {
            do {
                System.out.println("Calificacion del cliente " + (i+1) + " del 1 al 5");
                calificaciones[i] = sc.nextInt();
            } while (calificaciones [i] < 1 || calificaciones [i]> 5);
        }


        System.out.println("Promedio es "+ calcularPromedioSatisfaccion (calificaciones));

    }
    public static double calcularPromedioSatisfaccion (int[] calificaciones){

        double promedio = 0;

        for (int calificacion: calificaciones){
            promedio += calificacion;

        }

        return promedio/calificaciones.length;
    }
}
