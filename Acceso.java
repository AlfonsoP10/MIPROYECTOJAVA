// Clase principal que contiene el método main para ejecutar el programa
public class Acceso { 
    public static void main(String[] args) { 
        // Se obtiene la instancia única de ControlAcceso (patrón Singleton)
        ControlAcceso acceso1 = ControlAcceso.getInstancia(); 
        // Se inicia sesión con el usuario "Juan"
        acceso1.iniciarSesion("Juan"); 
 
        // Se obtiene otra referencia a la misma instancia de ControlAcceso
        ControlAcceso acceso2 = ControlAcceso.getInstancia(); 
        // Se muestra el usuario activo actual desde la segunda referencia
        acceso2.mostrarUsuarioActivo(); 
 
        // Se verifica si ambas referencias apuntan a la misma instancia
        System.out.println("Es la misma instancia? " + (acceso1 == acceso2)); 
    } 
} 
 
class ControlAcceso { 
    // Atributo estático que almacena la única instancia de la clase
    private static ControlAcceso instancia; 
    // Atributo que almacena el nombre del usuario que inició sesión
    private String usuarioActivo; 
 
    // Constructor privado: impide crear instancias desde fuera de la clase
    private ControlAcceso() { 
        this.usuarioActivo = "ninguno"; // Valor inicial por defecto
    } 
 
    // Método estático que retorna la única instancia de ControlAcceso
    public static ControlAcceso getInstancia() { 
        // Si aún no se ha creado la instancia, se crea aquí
        if (instancia == null) { 
            instancia = new ControlAcceso(); 
        }
        // Se retorna la instancia (nueva o ya existente)
        return instancia; 
    } 
 
    // Método para iniciar sesión: asigna el usuario activo
    public void iniciarSesion(String usuario) { 
        this.usuarioActivo = usuario; 
        System.out.println("Sesion iniciada por: " + usuario); 
    } 
 
    // Método para mostrar el usuario que está actualmente activo
    public void mostrarUsuarioActivo() { 
        System.out.println("Usuario actual: " + usuarioActivo); 
    } 
} 
