import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        
        if (b != 0) {
            System.out.println("División: " + ((float) a / b));
        } else {
            System.out.println("División: No es posible dividir por cero.");
        }
        
        scanner.close();
    }
}

