import java.util.Scanner;
public class Ejdowhile2{
    public static void main(String[]x){
        int calificacion = -1;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite una calificacion ente 0 y 5: ");
        calificacion = sc.nextInt();
        } while (calificacion < 0 || calificacion > 5);
        

    }
}