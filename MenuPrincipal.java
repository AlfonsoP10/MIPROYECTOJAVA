import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== MENÚ PRINCIPAL ====");
            System.out.println("1. Acceso");
            System.out.println("2. ClasificadorNumeros");
            System.out.println("3. ControlDeAcceso");
            System.out.println("4. GestionEmpleado");
            System.out.println("5. Global");
            System.out.println("6. Productos");
            System.out.println("7. ProgramaCalculadora");
            System.out.println("8. ProgramaCuenta");
            System.out.println("9. ProgramaEstudiante");
            System.out.println("10. ProgramaPersona");
            System.out.println("11. ProgramaRectangulo");
            System.out.println("12. RegistroEstudiantes");
            System.out.println("13. RegistroVehiculos");
            System.out.println("14. adivinanza");
            System.out.println("15. adivinanzado");
            System.out.println("16. calf");
            System.out.println("17. calfasd");
            System.out.println("18. capicua");
            System.out.println("19. contador");
            System.out.println("20. contra");
            System.out.println("21. division");
            System.out.println("22. edad");
            System.out.println("23. multiplicacion");
            System.out.println("24. numero");
            System.out.println("25. par");
            System.out.println("26. pareseimpares");
            System.out.println("27. primos");
            System.out.println("28. problema1");
            System.out.println("29. problema2");
            System.out.println("30. problema3");
            System.out.println("31. problema4");
            System.out.println("32. problema5");
            System.out.println("33. resta");
            System.out.println("34. sumaN");
            System.out.println("35. tablas");
            System.out.println("36. test");
            System.out.println("37. triangulo");
            System.out.println("38. usuario0");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Acceso.main(null);
                    break;
                case 2:
                    ClasificadorNumeros.main(null);
                    break;
                case 3:
                    ControlDeAcceso.main(null);
                    break;
                case 4:
                    GestionEmpleado.main(null);
                    break;
                case 5:
                    Global.main(null);
                    break;
                case 6:
                    Productos.main(null);
                    break;
                case 7:
                    ProgramaCalculadora.main(null);
                    break;
                case 8:
                    ProgramaCuenta.main(null);
                    break;
                case 9:
                    ProgramaEstudiante.main(null);
                    break;
                case 10:
                    ProgramaPersona.main(null);
                    break;
                case 11:
                    ProgramaRectangulo.main(null);
                    break;
                case 12:
                    RegistroEstudiantes.main(null);
                    break;
                case 13:
                    RegistroVehiculos.main(null);
                    break;
                case 14:
                    adivinanza.main(null);
                    break;
                case 15:
                    adivinanzado.main(null);
                    break;
                case 16:
                    calf.main(null);
                    break;
                case 17:
                    calfasd.main(null);
                    break;
                case 18:
                    capicua.main(null);
                    break;
                case 19:
                    contador.main(null);
                    break;
                case 20:
                    contra.main(null);
                    break;
                case 21:
                    division.main(null);
                    break;
                case 22:
                    edad.main(null);
                    break;
                case 23:
                    multiplicacion.main(null);
                    break;
                case 24:
                    numero.main(null);
                    break;
                case 25:
                    par.main(null);
                    break;
                case 26:
                    pareseimpares.main(null);
                    break;
                case 27:
                    primos.main(null);
                    break;
                case 28:
                    problema1.main(null);
                    break;
                case 29:
                    problema2.main(null);
                    break;
                case 30:
                    problema3.main(null);
                    break;
                case 31:
                    problema4.main(null);
                    break;
                case 32:
                    problema5.main(null);
                    break;
                case 33:
                    resta.main(null);
                    break;
                case 34:
                    sumaN.main(null);
                    break;
                case 35:
                    tablas.main(null);
                    break;
                case 36:
                    test.main(null);
                    break;
                case 37:
                    triangulo.main(null);
                    break;
                case 38:
                    usuario0.main(null);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);
    }
}
