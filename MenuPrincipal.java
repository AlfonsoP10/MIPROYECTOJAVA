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
            System.out.println("5. GestionEmpleado");
            System.out.println("6. Global");
            System.out.println("7. Productos");
            System.out.println("8. ProgramaCalculadora");
            System.out.println("9. ProgramaCuenta");
            System.out.println("10. ProgramaEstudiante");
            System.out.println("11. ProgramaPersona");
            System.out.println("12. ProgramaRectangulo");
            System.out.println("13. RegistroEstudiantes");
            System.out.println("14. RegistroVehiculos");
            System.out.println("15. adivinanza");
            System.out.println("16. adivinanzado");
            System.out.println("17. calf");
            System.out.println("18. calfasd");
            System.out.println("19. capicua");
            System.out.println("20. contador");
            System.out.println("21. contra");
            System.out.println("22. division");
            System.out.println("23. edad");
            System.out.println("24. multiplicacion");
            System.out.println("25. numero");
            System.out.println("26. par");
            System.out.println("27. pareseimpares");
            System.out.println("28. primos");
            System.out.println("29. problema1");
            System.out.println("30. problema2");
            System.out.println("31. problema3");
            System.out.println("32. problema4");
            System.out.println("33. problema5");
            System.out.println("34. resta");
            System.out.println("35. sumaN");
            System.out.println("36. tablas");
            System.out.println("37. test");
            System.out.println("38. triangulo");
            System.out.println("39. usuario0");
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
            case 5:
                GestionEmpleado.main(null);
                break;
            case 6:
                Global.main(null);
                break;
            case 7:
                Productos.main(null);
                break;
            case 8:
                ProgramaCalculadora.main(null);
                break;
            case 9:
                ProgramaCuenta.main(null);
                break;
            case 10:
                ProgramaEstudiante.main(null);
                break;
            case 11:
                ProgramaPersona.main(null);
                break;
            case 12:
                ProgramaRectangulo.main(null);
                break;
            case 13:
                RegistroEstudiantes.main(null);
                break;
            case 14:
                RegistroVehiculos.main(null);
                break;
            case 15:
                adivinanza.main(null);
                break;
            case 16:
                adivinanzado.main(null);
                break;
            case 17:
                calf.main(null);
                break;
            case 18:
                calfasd.main(null);
                break;
            case 19:
                capicua.main(null);
                break;
            case 20:
                contador.main(null);
                break;
            case 21:
                contra.main(null);
                break;
            case 22:
                division.main(null);
                break;
            case 23:
                edad.main(null);
                break;
            case 24:
                multiplicacion.main(null);
                break;
            case 25:
                numero.main(null);
                break;
            case 26:
                par.main(null);
                break;
            case 27:
                pareseimpares.main(null);
                break;
            case 28:
                primos.main(null);
                break;
            case 29:
                problema1.main(null);
                break;
            case 30:
                problema2.main(null);
                break;
            case 31:
                problema3.main(null);
                break;
            case 32:
                problema4.main(null);
                break;
            case 33:
                problema5.main(null);
                break;
            case 34:
                resta.main(null);
                break;
            case 35:
                sumaN.main(null);
                break;
            case 36:
                tablas.main(null);
                break;
            case 37:
                test.main(null);
                break;
            case 38:
                triangulo.main(null);
                break;
            case 39:
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
