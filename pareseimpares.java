import java.util.Scanner;

public class pareseimpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        int sumaPares = 0, sumaImpares = 0;
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 1; i <= numero1; i++) {
            if (i % 2 == 0) {
                System.out.println("El número es par: " + i);
                sumaPares += i;
                contadorPares++;
            } else {
                System.out.println("El número es impar: " + i);
                sumaImpares += i;
                contadorImpares++;
            }
        }

        System.out.println("\nCantidad de pares: " + contadorPares + ", suma: " + sumaPares);
        System.out.println("Cantidad de impares: " + contadorImpares + ", suma: " + sumaImpares);
        // scanner.close();  // Eliminado para evitar error de entrada
    }
}
