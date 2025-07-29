import java.util.Scanner;
import java.util.Random;

public class adivinanza{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intentos = 7;

        for (int i = 0; i < intentos; i++) {
            System.out.print("Adivina el numero (1-100): ");
            int intento = sc.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("Felicidades Adivinaste el numero.");
                break;
            }

            if ((intento >= numeroSecreto - 10 && intento < numeroSecreto) ||
                (intento <= numeroSecreto + 10 && intento > numeroSecreto)) {
                System.out.println("Estas muy cerca");
            }

            if (intento < numeroSecreto) {
                System.out.println("El numero secreto es mayor.");
            }

            if (intento > numeroSecreto) {
                System.out.println("El numero secreto es menor.");
            }

            if (i == intentos - 1) {
                System.out.println("Se acabaron tus intentos. El numero era " + numeroSecreto);
            }
        }


    }
}