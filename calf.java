import java.util.Scanner;

public class calf{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa la calificacion");
        int numero1=scanner.nextInt();
        if (numero1>=60){
            System.out.println("Usted aprobo");
        }
        else{
            System.out.println("Usted reprobo");
        }
        // scanner.close();  // Eliminado para evitar error de entrada
    }
}