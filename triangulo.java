
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int numero1 = scanner.nextInt();
        
        for (int i = 1; i <= numero1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");//
            }
            System.out.println();//
        }
    // scanner.close();  // Eliminado para evitar error de entrada
    }
}
