import java.util.Scanner;

public class contra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña;

        // Expresión regular corregida:
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

        do {
            System.out.print("Introduce una contraseña segura: ");
            contraseña = sc.nextLine();
        } while (!contraseña.matches(regex));

        System.out.println("Contraseña válida");

    }
}
