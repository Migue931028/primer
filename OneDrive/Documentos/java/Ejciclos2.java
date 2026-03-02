import java.util.Scanner;
public class Ejciclos2{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite su edad: ");
        double n1 = sc.nextDouble();
        if (n1 >= 18){
        System.out.print("Usted es mayor de edad");
        }else if (n1 == 67){
          System.out.print("Usted es un SIXSEVEN=SIXSEVEN");  
        }
        else {
        System.out.print("Usted es menor de edad");
            
        }

    } 
}