import java.util.Scanner;

public class RegistroVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el year del vehiculo: ");
        int anio = scanner.nextInt();

        Vehiculo vehiculo = new Vehiculo(marca, anio);
        vehiculo.puedeCircular();

        // scanner.close();  // Eliminado para evitar error de entrada
    }
}

class Vehiculo {
    private String marca;
    private int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void puedeCircular() {
        if (anio >= 2010) {
            System.out.println("El vehiculo " + marca + " (" + anio + ") puede circular.");
        } else {
            System.out.println("El vehiculo " + marca + " (" + anio + ") no puede circular.");
        }
    }
}
