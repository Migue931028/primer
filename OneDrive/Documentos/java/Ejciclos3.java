import java.util.Scanner;
public class Ejciclos3{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[]x){
        System.out.print("Digite su nota: ");
        double nota = sc.nextDouble();
        calificacion(nota);


        }
        public static void calificacion(double nota){
            if (nota >= 3){
                System.out.print("PASASTE");
            } else{
                System.out.print("REPROBASTE");
            }
        }
    }    