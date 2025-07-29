import java.util.Scanner;

public class contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int usuario;

        System.out.println("Ingrese el valor limite: ");
        usuario = sc.nextInt();

        System.out.println("La lista de los numeros positivos es:");
        while (numero <= usuario) {
            System.out.println(numero);
            numero++;
        }

    }
}