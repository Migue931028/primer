import java.util.Scanner;
public class Simparcial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu salario anual: ");
        double salarioAnual = sc.nextDouble();
        System.out.print("Introduce el porcentaje de tu salario a ahorrar, como un numero con decimal: ");
        double proporcionAhorrada = sc.nextDouble();
        System.out.print("Introduce el costo de la casa que deseas: ");
        double costoTotal = sc.nextDouble();
        double cuotaInicialRequerida = costoTotal * 0.35; 
        double totalMeses = calcularMesesRecursivo(0, 0.0, salarioAnual, proporcionAhorrada, cuotaInicialRequerida);     
        System.out.println("Número de meses: " + (int)totalMeses);
        sc.close();
    }
    public static double calcularInteresMensual(double ahorrosActuales) {
        return (ahorrosActuales * 0.05) / 12; 
    }
    public static int calcularMesesRecursivo(int mes, double ahorrosActuales, double salarioAnual, double proporcionAhorrada, double cuotaInicialRequerida) {
        if (ahorrosActuales >= cuotaInicialRequerida) {
            return mes;
        }
        double interes = calcularInteresMensual(ahorrosActuales);
        double ahorroDelMes = (salarioAnual / 12) * proporcionAhorrada; 
        return calcularMesesRecursivo(mes + 1, ahorrosActuales + interes + ahorroDelMes, salarioAnual, proporcionAhorrada, cuotaInicialRequerida);
    }
}