public class BuclesYMetodos_3 {
    public static void main(String[] args) {
        String[] clientes = {"Nico","Marcos","Martin","Rocio"};
        int[] facturasPendientes = {501,400,600,1000};

        enviarFacturas(clientes, facturasPendientes);
    }
    public static void enviarFacturas (String[] clientes, int[] facturasPendientes){
        System.out.println("Clientes con facturas mayores a $500");

        for (int i = 0; i < clientes.length; i++) {

            if (facturasPendientes[i] > 500){
                System.out.println(clientes[i] + " - debe "+ facturasPendientes[i]);
            }

        }
    }
}
