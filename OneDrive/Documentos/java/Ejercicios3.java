//Problema: cocadenar variables y calcular la edad del usuario 
//Entradas:Nombre del usuario - Año de nacimiento -
//Salidas:Edad - Mensaje
//Ejemplo: 17 años - hola miguel tienes 18 años
import java.util.Scanner;
public class Ejercicios3{
    public static void main (String[]x){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite su nombre:");
        String nombre = sc.next();
        sc.nextLine();
        System.out.print("Digite su ano de nacimiento:");
        int ano = sc.nextInt();
        sc.nextLine();
        int edad = 2026 - ano;
        System.out.println("Hola "+nombre+" tienes aproximadamente "+edad+" anos.");
    }
}