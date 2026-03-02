import java.util.Scanner;
public class Ejercicios5{
    public static void main (String[]x){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite grados Celsius: ");
        double celsius = sc.nextDouble();
        sc.nextLine();
        double fah = (celsius * 9/5) + 32;
        System.out.println(+celsius+" Celsius son:"+fah+" Fahrenheit.");
        
        }
        }