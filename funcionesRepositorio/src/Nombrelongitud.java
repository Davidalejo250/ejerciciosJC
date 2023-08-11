import java.util.Scanner;

public class Nombrelongitud {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String name = console.nextLine();
        
        imprimirInformacionNombre(name);
        
        console.close();
    }

    private static void imprimirInformacionNombre(String name) {
        System.out.println("Numero de caracteres: " + name.length());
        System.out.println("Caracteres del nombre:");
        for (char con : name.toCharArray()) {
            System.out.println("Caracter : "+con);
        }
    }
}