import java.util.Scanner;
import java.util.Random;

public class adivinanzado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (1-100): ");
            intento = sc.nextInt();

            if (Math.abs(intento - numeroSecreto) <= 10) {
                System.out.println("¡Estás muy cerca!");
            }

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            }

            if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            }

        } while (intento != numeroSecreto);

        System.out.println("Felicidades, adivinaste el número: " + numeroSecreto);
   

	}

}
