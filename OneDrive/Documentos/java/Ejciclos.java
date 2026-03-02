import java.util.Scanner;
public class Ejciclos{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero entero: ");
        int n1 = sc.nextInt();
        if (n1 >= 0){
            System.out.print("Su numero es positivo");
        } else {
            System.out.print("su numero es negativo");
        }
    }
}