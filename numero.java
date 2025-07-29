import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int numero1=scanner.nextInt();
        
        if (numero1>0){
            System.out.println("Es positivo");

        }
        else if (numero1 < 0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es 0");
        }
    // scanner.close();  // Eliminado para evitar error de entrada
    }
}