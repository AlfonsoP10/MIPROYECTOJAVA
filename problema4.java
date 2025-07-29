import java.util.Random;
import java.util.Scanner;

public class problema4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int secreto = rand.nextInt(100) + 1;
        int intentos = 5;

        System.out.println("Adivina el número entre 1 y 100. Tienes 5 intentos.");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": ");
            int respuesta = scanner.nextInt();

            if (respuesta == secreto) {
                System.out.println("¡Correcto! Adivinaste el número.");
            } else {
                if (respuesta < secreto) {
                    System.out.println("Demasiado bajo.");
                } else {
                    System.out.println("Demasiado alto.");
                }
            }

            if (i == intentos) {
                System.out.println("El número secreto era: " + secreto);
            }
        }

    
    }
}
