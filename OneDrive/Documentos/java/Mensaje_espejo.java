import java.util.Scanner;
public class Mensaje_espejo{
    public static void main (String[]x){
        Scanner lector = new Scanner(System.in);
        String mensaje;
    System.out.println("Digite un mensaje, este sera repetido por el sistema:");
    mensaje = lector.nextLine();
    System.out.println("esta es la repeticion: "+mensaje);
    }

}