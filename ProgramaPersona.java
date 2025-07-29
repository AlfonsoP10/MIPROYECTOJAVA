import java.util.Scanner;

public class ProgramaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion;

        do {
            System.out.println("Registrate por favor");
            System.out.println("1) para continuar");
            System.out.println("2) para salirse");
            System.out.print("Opcion: ");
            eleccion = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea pendiente

            if (eleccion == 1) {
                System.out.print("Ingrese su nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese su edad: ");
                int edad = sc.nextInt();
                sc.nextLine(); // Limpiar de nuevo si es necesario

                Persona p = new Persona(nombre, edad);
                p.mostrarInfo();
            }

        } while (eleccion != 2);

        System.out.println("Gracias por registrarte");
    
    }
}

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("\n--- Informacion registrada ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}