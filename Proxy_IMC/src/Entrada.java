import java.util.Scanner;

// Clase de utilidad para manejar la entrada de datos
public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    // Método para leer un número decimal (double) desde la entrada estándar
    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}
