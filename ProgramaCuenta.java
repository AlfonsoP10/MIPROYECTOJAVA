import java.util.Scanner;

public class ProgramaCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(0); // Saldo inicial en 0
        int eleccion;

        do {
            System.out.println("\nBienvenido al banco, escoja una de estas opciones:");
            System.out.println("1) Depositar");
            System.out.println("2) Retirar");
            System.out.println("3) Mostrar saldo");
            System.out.println("4) Salirse");
            System.out.print("Opcion: ");
            eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    if (cuenta.getSaldo() == 0) {
                        System.out.println("No puede retirar nada. Su cuenta no tiene dinero.");
                    } else {
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double retiro = sc.nextDouble();
                        cuenta.retirar(retiro);
                    }
                    break;
                case 3:
                    cuenta.mostrarSaldo();
                    break;
            }
        } while (eleccion != 4);
        System.out.print("Gracias por usar nuestra app de banco");
    
    }
}

class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para retirar.");
        }
    }
    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}