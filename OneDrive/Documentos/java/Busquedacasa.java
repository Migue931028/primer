/**
 * Análisis del Problema:
 * - Descripción: Calcula el tiempo en meses para ahorrar la cuota inicial de una casa mediante recursión. [cite: 9, 24]
 * - Entradas: 
 * 1. salarioAnual (double) [cite: 27]
 * 2. proporcionAhorrada (double) [cite: 28]
 * 3. costoTotal (double) [cite: 29]
 * - Salidas: 
 * 1. Número de meses (int) [cite: 34]
 * - Ejemplo: Salario 120000, Ahorro 0.10, Casa 1000000 -> 216 meses. [cite: 38]
 */

import java.util.Scanner;

public class Busquedacasa{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // --- Lectura de datos del usuario --- [cite: 26, 31]
        System.out.print("Introduce tu salario anual: ");
        double salarioAnual = lector.nextDouble();

        System.out.print("Introduce el porcentaje de tu salario a ahorrar, como un numero con decimal: ");
        double proporcionAhorrada = lector.nextDouble();

        System.out.print("Introduce el costo de la casa que deseas: ");
        double costoTotal = lector.nextDouble();

        // --- Variables constantes del problema ---
        double proporcionCuotaInicial = 0.35; // [cite: 16]
        double cuotaInicialRequerida = costoTotal * proporcionCuotaInicial;
        double tasaRetornoAnual = 0.05; // [cite: 19]
        
        // --- Llamado a la subrutina recursiva --- 
        int totalMeses = calcularMesesRecursivo(0, 0.0, salarioAnual, proporcionAhorrada, cuotaInicialRequerida, tasaRetornoAnual);

        // --- Impresión de resultados --- [cite: 34]
        System.out.println("Número de meses: " + totalMeses);

        lector.close();
    }

    /**
     * Método recursivo que sustituye el uso de ciclos (for/while).
     * Calcula mes a mes el incremento de ahorros.
     */
    public static int calcularMesesRecursivo(int meses, double ahorrosActuales, double salarioAnual, 
                                             double proporcionAhorrada, double meta, double tasa) {
        
        // Caso base: Si ya se alcanzó o superó la meta, retornamos el conteo de meses
        if (ahorrosActuales >= meta) {
            return meses;
        }

        // Lógica de ahorro mensual:
        // 1. Rendimiento de la inversión 
        double rendimientoMensual = ahorrosActuales * (tasa / 12);
        // 2. Ahorro del salario 
        double ahorroSalario = (salarioAnual / 12) * proporcionAhorrada;
        
        // Actualizar el monto acumulado
        double nuevosAhorros = ahorrosActuales + rendimientoMensual + ahorroSalario;

        // Llamada recursiva para el siguiente mes
        return calcularMesesRecursivo(meses + 1, nuevosAhorros, salarioAnual, proporcionAhorrada, meta, tasa);
    }
}