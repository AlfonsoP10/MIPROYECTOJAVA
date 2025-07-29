import java.util.Scanner;

public class capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer valor: ");
        int inicio = sc.nextInt();
        System.out.print("Introduzca el valor tope: ");
        int tope = sc.nextInt();


        System.out.println("Números capicúa entre " + inicio + " y " + tope + ":");
        for (int i = inicio; i <= tope; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esCapicua(int num) {
        int original = num;
        int inverso = 0;

        while (num > 0) {
            int digito = num % 10;
            inverso = inverso * 10 + digito;
            num /= 10;
        }

        return original == inverso;
    }
}
