import java.util.Scanner;
public class Ejciclos5{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        double numero1= sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite otro numero: ");
        double numero2 = sc.nextDouble();
        if (numero1 > numero2){
            System.out.print("El primer numero es mayor que el segundo");
        } else if (numero2 > numero1){
            System.out.print("El segundo numero es mayor que el primero");
        } else{
            System.out.print("Los dos numeros son iguales");
        }
    }
}