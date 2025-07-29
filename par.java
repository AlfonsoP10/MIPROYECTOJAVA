import java.util.Scanner;

public class par{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int numero1=scanner.nextInt();
        if (numero1%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
        // scanner.close();  // Eliminado para evitar error de entrada

    }
    
}