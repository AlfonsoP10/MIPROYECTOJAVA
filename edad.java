import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        int numero1=scanner.nextInt();
        
        if (numero1==16|| numero1==17){
            System.out.println("Ingres a la fiesta pero con permiso");

        }
        else if (numero1 <16) {
            System.out.println("Es menor de edad");
        }
        else {
            System.out.println("Es mayor de edad (18 años)");
        }
                // scanner.close();  // Eliminado para evitar error de entrada

    }
}