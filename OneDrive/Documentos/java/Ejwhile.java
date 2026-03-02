import java.util.Scanner;
public class Ejwhile{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero entero: ");
        int n1 = sc.nextInt();
        int contador = 0;
        while (contador <= n1){
            System.out.println("contador: "+contador);
            contador++;
        } 
    }
}