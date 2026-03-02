//Problema: pedir al usuario los valores de una cuenta y dar el resultado de esta añadiendole otros parametros como el iva
//Entradas:Precio de un producto - Cantidad de productos comprados
//Salidas:El subtotal - valor del IVA - Total a pagar - 
//Ejemplo: 100pesos - 19pesos - 119pesos- 
import java.util.Scanner;
public class Ejercicios2{
    public static void main (String[]x){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ingresa el precio del producto:");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese la cantidad de productos que va a adquirir:");
        int cantidad = sc.nextInt();
        sc.nextLine();
        double iva = 0.19;
        double subtotal = precio*cantidad;
        double valor_iva = subtotal*iva;
        double total = subtotal+valor_iva;
        System.out.println("El subtotal es:"+subtotal+"\nEl valor del IVA es:"+valor_iva+"\nEl valor total es:"+total);

    }
}