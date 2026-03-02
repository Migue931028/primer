import java.util.Scanner;
public class Ejarreglos{
    public static void main(String[]x){
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite cuantos elementos va a tener el arreglo: ");
        int tarreglo = sc.nextInt();
        sc.nextLine();
        
        int[] arreglo = new int[tarreglo];
        
        int suma = 0;
        
        for ( int i = 0; i < arreglo.length; i++){
            System.out.print("Digite los valores que van en la lista: ");
            int valor = sc.nextInt();
            sc.nextLine();
            arreglo[i]= valor;

        }
        for ( int c= 0; c < arreglo.length; c++){
            System.out.println(arreglo[c]);
        }
        for (int a=0; a < arreglo.length; a++){
            suma += arreglo[a];
        }
        System.out.println("El promedio del arreglo es: "+promedio(suma,tarreglo));

        System.out.print("Digite el valor a buscar en el arreglo: ");
        int valorbuscar= sc.nextInt();
        sc.nextLine();
        if (encuentra(arreglo,valorbuscar))
        
        
    }
    public static double promedio(int suma, int tarreglo){
        return suma/tarreglo;
    }
    public static boolean encuentra(int[] arreglo, int valorbuscar){
        for (int b=0; b < arreglo.length; b++){
            if (arreglo[b] == valorbuscar){
               true;
            }else{
                false;
            }
        }
        boolean siono =

    }
}