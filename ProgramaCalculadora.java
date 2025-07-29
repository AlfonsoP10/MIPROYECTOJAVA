import java.util.Scanner;

public class ProgramaCalculadora { 
    public static void main(String[] args) { 
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int eleccion;
        do{
            System.out.println("\nSeleccione que va a hacer la calculadora:");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            System.out.print("Opcion: ");
            eleccion = sc.nextInt();
            if (eleccion>=1 && eleccion<=4){
                System.out.println("Ingrese el primer valor");
                int a= sc.nextInt();
                System.out.println("Ingrese el segundo valor:");
                int b=sc.nextInt();
                switch(eleccion){
                    case 1:
                        System.out.println("Suma: " + calc.sumar(a, b)); 
                        break;
                    case 2:
                        System.out.println("Resta: " + calc.restar(a, b));
                        break;
                    case 3:
                        System.out.println("Multiplicacion: " + calc.multiplicar(a, b));
                        break;
                    case 4:
                        System.out.println("Division: " + calc.dividir(a, b));
                        break;
                }
            }
        }
        while(eleccion!=5);
        System.out.println("Gracias por usar nuestra calculadora");
        
    } 
}

class Calculadora { 
// Método para sumar dos números enteros
public int sumar(int a, int b) { 
return a + b; 
} 
// Método para restar dos números enteros 
public int restar(int a, int b) { 
return a - b; 
} 
// Método para multiplicar dos números enteros 
public int multiplicar(int a, int b) { 
return a * b; 
    } 
 
    // Método para dividir dos números enteros con control de división por cero 
    public double dividir(int a, int b) { 
        if (b == 0 || a==0) { 
            System.out.println("Error: Division por cero no permitida."); 
            return 0; 
        } 
        return (double) a / b; 
    } 
}
