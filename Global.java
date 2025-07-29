// Clase principal con el método main para ejecutar el programa
public class Global { 
    public static void main(String[] args) { 
        // Se obtiene la instancia única de ContadorGlobal
        ContadorGlobal c1 = ContadorGlobal.getInstancia(); 
        // Se incrementa el contador dos veces usando la primera referencia
        c1.incrementar(); 
        c1.incrementar(); 
 
        // Se obtiene otra referencia a la misma instancia de ContadorGlobal
        ContadorGlobal c2 = ContadorGlobal.getInstancia(); 
        // Se incrementa el contador una vez más usando la segunda referencia
        c2.incrementar(); 
 
        // Se muestra el valor del contador desde la primera referencia
        c1.mostrarContador();  // Debe mostrar 3 
        // Se muestra el valor del contador desde la segunda referencia
        c2.mostrarContador();  // También debe mostrar 3 
 
        // Se verifica que ambas referencias apuntan a la misma instancia
        System.out.println("Es la misma instancia? " + (c1 == c2)); 
    } 
} 

// Clase que implementa un contador global como Singleton
class ContadorGlobal { 
    // Atributo estático que guarda la única instancia de la clase
    private static ContadorGlobal instancia; 
    // Atributo para almacenar el valor del contador
    private int contador; 
 
    // Constructor privado para evitar la creación de múltiples instancias
    private ContadorGlobal() { 
        contador = 0;  // Inicializa el contador en cero
    } 
 
    // Método estático para obtener la única instancia de la clase
    public static ContadorGlobal getInstancia() { 
        // Si no existe la instancia aún, se crea
        if (instancia == null) { 
            instancia = new ContadorGlobal(); 
        } 
        // Devuelve la instancia existente
        return instancia; 
    } 
 
    // Método para incrementar el contador en 1
    public void incrementar() { 
        contador++; 
    } 
 
    // Método para mostrar el valor actual del contador
    public void mostrarContador() { 
        System.out.println("Contador: " + contador); 
    } 
} 