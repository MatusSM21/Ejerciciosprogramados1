import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        double radio, area, perimetro;
        final double PI = 3.14159;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el radio del círculo: ");
        radio = scanner.nextDouble();
        
        area = PI * radio * radio;
        perimetro = 2 * PI * radio;
        
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
