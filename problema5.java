public class problema5 {
       public static void main(String[] args) {
        for (int num = 100; num <= 110; num++) {
            int centenas = num / 100;
            int decenas = (num / 10) % 10;
            int unidades = num % 10;

            int suma = centenas + decenas + unidades;

            System.out.println("La suma de dígitos de " + num + " es: " + suma);
        }
    }
}
