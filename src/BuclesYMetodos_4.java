public class BuclesYMetodos_4 {
    public static void main(String[] args) {
        String[] clientes = {"Nico","Martin","Rocio", "Rei"};
        int[] compras = {11,9,2,5};

        calcularDescuentos (clientes,compras);

    }
    public static void calcularDescuentos (String[] clientes, int[] compras) {

        for (int i = 0; i < clientes.length; i++) {

            if (compras [i] > 10) {
                System.out.println("Usted " + clientes[i] + " tiene un descuento del 10%");
            }
        }
    }
}
