import java.util.Scanner;

public class ProgramaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion;

        do {
            System.out.println("\nElija una de las siguientes opciones:");
            System.out.println("1) Calcular area y Perimetro de un rectangulo");
            System.out.println("2) Salir");
            System.out.print("Opcion: ");
            eleccion = sc.nextInt();

            if (eleccion == 1) {
                System.out.print("Ingrese la base: ");
                double base = sc.nextDouble();

                System.out.print("Ingrese la altura: ");
                double altura = sc.nextDouble();

                Rectangulo rect = new Rectangulo(base, altura);
                System.out.println("Area: " + rect.calcularArea());
                System.out.println("Perimetro: " + rect.calcularPerimetro());
            }
        } while (eleccion != 2);
        System.out.println("Hasta luego");
       
    }
}

class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}