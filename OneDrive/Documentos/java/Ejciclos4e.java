import java.util.Scanner;
public class Ejciclos4e{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        double numero = sc.nextDouble();
        if (numero > 0){
            System.out.print("El numero es positivo");
        } else if ( numero < 0){
            System.out.print("El numero es negativo");
        } else{
            System.out.print("El numero es 0");
        }
    }

}