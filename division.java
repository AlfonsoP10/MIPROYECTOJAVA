import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int numero1=scanner.nextInt();

        System.out.println("Ingresa el Segundo numero: ");
        int numero2=scanner.nextInt();

        int div = numero1/numero2;
        System.out.println("La suma es: "+div);

        // scanner.close();  // Eliminado para evitar error de entrada
    }
}