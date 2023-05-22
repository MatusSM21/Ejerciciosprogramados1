import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular la temperatura en grados Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Mostrar el resultado en pantalla
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


