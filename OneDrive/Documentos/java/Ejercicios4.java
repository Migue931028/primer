import java.util.Scanner;
public class Ejercicios4{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite su numero de identificacion: ");
        String identificacion = sc.next();
        System.out.print("Digite el valor de su compra: ");
        double valor = sc.nextDouble();
        if (valor < 300000){
            System.out.print("-No aplica descuento\n-Su valor a pagar es: "+valor);
        } else if (valor >= 300000 && valor < 1000000){
            double total5 = (valor-descuento5(valor));
            System.out.print("-Su descuento es del 5%\n-Su valor a pagar es: "+total5);
        } else {
            double total10 = (valor-descuento10(valor));
            System.out.print("-Su descuento es del 10%\n-Su valor a pagar es: "+total10);
        }
    }
    /*
    -metodo descuento5:
Descripcion: este metodo calcula el descuento del 5% al valor total de la compra.
Parametros: valor - el valor de la compra.
Retorno: el descuento del 5% del valor de la compra.
    */
    public static double descuento5(double valor){
        return valor*0.05;
    }
    /*
    -metodo descuento10:
Descripcion: este metodo calcula el descuento del 10% al valor total de la compra.
Parametros: valor - el valor de la compra.
Retorno: el descuento del 10% del valor de la compra.
    */
    public static double descuento10(double valor){
        return valor*0.10;
    }
}