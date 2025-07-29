import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad en stock: ");
        int stock = scanner.nextInt();

        Producto producto = new Producto(nombre, stock);
        producto.verificarDisponibilidad();

        // scanner.close();  // Eliminado para evitar error de entrada
    }
}

class Producto {
    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public void verificarDisponibilidad() {
        if (stock > 0) {
            System.out.println("El producto \"" + nombre + "\" esta disponible. Stock: " + stock);
        } else {
            System.out.println("El producto \"" + nombre + "\" no esta disponible.");
        }
    }
}
