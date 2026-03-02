import java.util.Scanner;
public class Ejarreglos{
    public static void main(String[]x){
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite cuantos elementos va a tener el arreglo: ");
        int tarreglo = sc.nextInt();
        int[] arreglo = new int[tarreglo];
        
        for ( int c= 0; c < arreglo.length; c++){
            System.out.print(arreglo[c]);
        }
    }
}