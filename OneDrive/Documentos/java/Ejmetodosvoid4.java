import java.util.Scanner;
public class Ejmetodosvoid4{
    public static void main (String[]x){
        mensajePersonalizado();
        mensajePersonalizado();
        mensajePersonalizado();


    }
    public static void mensajePersonalizado(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        System.out.println("Buenos dias ");
    }

}