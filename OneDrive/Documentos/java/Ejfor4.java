import java.util.Scanner;
public class Ejfor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número entero (N): ");
        int n = input.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma *= i;
        }
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        
    }
}