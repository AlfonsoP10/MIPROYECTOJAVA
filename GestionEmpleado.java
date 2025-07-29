import java.util.Scanner;

public class GestionEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, salario);
        empleado.evaluarSalario();

        // scanner.close();  // Eliminado para evitar error de entrada
    }
}

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void evaluarSalario() {
        if (salario >= 10000) {
            System.out.println("El empleado " + nombre + " tiene un salario competitivo: $" + salario);
        } else {
            System.out.println("El empleado " + nombre + " no tiene un salario competitivo: $" + salario);
        }
    }
}

