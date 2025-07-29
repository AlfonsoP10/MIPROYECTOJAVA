public class Estudiante {
    private String nombre;
    private double promedio;

    public Estudiante(String nombre, double promedio) {
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
