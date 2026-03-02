import java.util.Scanner;
public class Simparcial{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la coordenada x1:");
        double x1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite la coordenada x2:");
        double x2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite la coordenada y1:");
        double y1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite la coordenada x2:");
        double y2 = sc.nextDouble();
        System.out.println("El punto medio entre las cordenadas de Martin y Ricarde es: "+puntomediomx(x1,x2)+","+puntomediomy(y1,y2));
        System.out.println("La pendietne de la ecuacion es: "+pendiente(x1,x2,y1,y2));
        general();

    }
    public static double puntomediomx(double x1, double x2){
        return (x1+x2)/2;
        
    }
    public static double puntomediomy(double y1, double y2){
        return (y1+y2)/2;
    
}
    public static double pendiente(double x1, double x2,double y1, double y2){
        return (y2 - y1)/(x2 - x1);
    }
    public static void general(){
    System.out.println("La ecuacion general para calcular la recta dada una coordenada y la pendiente es: [ y-y1=m(x-x1) ]");
}
}