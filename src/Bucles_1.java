import java.util.Scanner;

public class Bucles_1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        //Creo una lista con las actividades y las horas
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        double [] horas = new double[actividades.length]; //Conocer la cantidad de elementos que hay en la lista
        double tiempoTotal = 0;
        //Para guardar las horas de cada actividad
        for (int i = 0; i < actividades.length; i++) {

            System.out.print("Ingrese las horas dedicadas a " + actividades[i] + ": ");
            horas[i] =sc.nextDouble();
        }
// Calcular el tiempo total
        for (double hora : horas) {
            tiempoTotal += hora;
        }
// Mostrar la actividad con su respectivo tiempo
        for (int i = 0; i < actividades.length; i++) {
            System.out.println("Tiempo dedicado a " + actividades[i] + ": " + horas[i] + " horas");
        }

        System.out.println("Tiempo total dedicado: " + tiempoTotal + " horas");
    }
}