import java.util.Scanner;
public class Ejreturn{
    public static void main(String[]x){
       pedirnumero();

    }
    public static int suma(int n1, int n2){
       return n1 + n2;

    }
    public static void pedirnumero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero entero: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite otro numero entero: ");
        int n2 = sc.nextInt();
        System.out.print(suma(n1, n2));

    }
}