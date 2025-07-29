
import java.util.Scanner;

public class sumaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingresa el primer numero: ");
        int numero1=scanner.nextInt();
        for (int i=1; i<=numero1; i++){
            suma+=i;
            System.out.println("el resultado de la suma de los numeros naturales hasta 10 es de: "+ suma);
        }
    
    // scanner.close();  // Eliminado para evitar error de entrada
    }
}