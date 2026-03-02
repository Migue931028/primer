import java.util.Scanner;
public class Ejreturn3{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite su calificacion: ");
        double nota = sc.nextDouble();

        if (pasa(nota)) {
            System.out.print("PASASTE");
        }
        else{
            System.out.print("NO PASASTE");
        }

    }
    public static boolean pasa (double nota){
        if (nota >=3.0){
            return true;
        }
        return false;
    }
}