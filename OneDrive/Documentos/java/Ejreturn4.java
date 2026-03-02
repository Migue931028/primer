import java.util.Scanner;
public class Ejreturn4{
    public static void main(String[]x){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite un numero: ");
    double n1 = sc.nextDouble();
    sc.nextLine();
    System.out.print("Digite otro numero: ");
    double n2 = sc.nextDouble();
    sc.nextLine();
    System.out.print("Digite otro numero: ");
    double n3 = sc.nextDouble();  
        if (promedio(n1,n2,n3)>= 4.5){
            System.out.print("promedio meritorio");
        }
        else{System.out.print("no tienes promedio meritorio");
    }
    }
    public static double promedio (double n1, double n2, double n3){
        return (n1+n2+n3)/3;
    }



}