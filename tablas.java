
import java.util.Scanner;

public class tablas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int numero1=scanner.nextInt();
        for (int i=1; i<=10; i++){
            int multi= numero1*i;
            System.out.println(numero1+"x"+i+"="+multi);
        }
    // scanner.close();  // Eliminado para evitar error de entrada
    }
}