import java.util.Scanner;

public class usuario0 {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Las sumas; ");
        numero= 1;
        while(numero!=0){
            int ped;
            int sum;
            System.out.print("Ingrese el primer valor; ");
            ped =sc.nextInt();
            sum =sc.nextInt();   
            int suma = ped+sum;
            System.out.println("el resultado de su suma es; "+suma);                                               
            System.out.print("Deseas continuar? si nos es asi pulse 0; ");
            numero = sc.nextInt();
        }
       
    }
}