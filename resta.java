
import java.util.Scanner;

public class resta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int numero1=scanner.nextInt();

        System.out.println("Ingresa el Segundo numero: ");
        int numero2=scanner.nextInt();

        int resta = numero1-numero2;
        System.out.println("La resta es: "+resta);
    // scanner.close();  // Eliminado para evitar error de entrada
    }
}