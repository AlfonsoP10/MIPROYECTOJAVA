import java.util.Scanner;

public class ProgramaEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.print("\nIngrese el nombre del estudiante: ");
            String nombre = sc.nextLine();

            int[] calificaciones = new int[4];
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.print("Ingrese calificación " + (i + 1) + ": ");
                calificaciones[i] = sc.nextInt();
            }
            sc.nextLine();

            Estudiante est = new Estudiante(nombre, calificaciones);
            est.mostrarPromedio();

            System.out.print("¿Desea registrar otro estudiante? (1 = Sí, 2 = No): ");
            opcion = sc.nextInt();
            sc.nextLine(); 

        } while (opcion == 1);

        System.out.println("Programa finalizado. ¡Hasta luego!");
        
    }
}
class Estudiante {
    String nombre;
    int[] calificaciones;

    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int cal : calificaciones) {
            suma += cal;
        }
        return (double) suma / calificaciones.length;
    }

    public void mostrarPromedio() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());
    }
}