import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        EstudianteLocal estudiante = new EstudianteLocal(nombre, promedio);
        estudiante.mostrarInformacion();

        // scanner.close();  // Eliminado para evitar error de entrada
    }
}

class EstudianteLocal {
    private String nombre;
    private double promedio;

    // Constructor corregido con el nombre de la clase
    public EstudianteLocal(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getEstado() {
        if (promedio >= 6.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + getEstado());
    }
}
