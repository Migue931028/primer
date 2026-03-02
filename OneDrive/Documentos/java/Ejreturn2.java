import java.util.Scanner;
public class Ejreturn2{
    public static void main(String[]x){
        pedirnumero();
    }
    public static void pedirnumero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero entero: ");
        int n1 = sc.nextInt();
        System.out.print(cuadrado(n1));


    }
    public static int cuadrado(int n1){
        return n1*n1;
    }
}