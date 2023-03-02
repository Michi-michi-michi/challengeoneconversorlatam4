import java.util.Scanner;

public class ConversorMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese la cantidad y la moneda de origen
        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();
        System.out.print("Ingrese la moneda de origen (EUR, USD o JPY): ");
        String monedaOrigen = scanner.next();
        
        // Definimos las tasas de cambio
        double tasaEURUSD = 1.21;
        double tasaEURJPY = 129.35;
        double tasaUSDEUR = 0.83;
        double tasaUSDJPY = 106.87;
        double tasaJPYEUR = 0.0077;
        double tasaJPYUSD = 0.0093;
        
        // Convertimos la cantidad a la moneda deseada
        double cantidadConvertida = 0.0;
        String monedaDestino = "";
        if (monedaOrigen.equals("EUR")) {
            System.out.print("Ingrese la moneda de destino (USD o JPY): ");
            monedaDestino = scanner.next();
            if (monedaDestino.equals("USD")) {
                cantidadConvertida = cantidad * tasaEURUSD;
            } else if (monedaDestino.equals("JPY")) {
                cantidadConvertida = cantidad * tasaEURJPY;
            }
        } else if (monedaOrigen.equals("USD")) {
            System.out.print("Ingrese la moneda de destino (EUR o JPY): ");
            monedaDestino = scanner.next();
            if (monedaDestino.equals("EUR")) {
                cantidadConvertida = cantidad * tasaUSDEUR;
            } else if (monedaDestino.equals("JPY")) {
                cantidadConvertida = cantidad * tasaUSDJPY;
            }
        } else if (monedaOrigen.equals("JPY")) {
            System.out.print("Ingrese la moneda de destino (EUR o USD): ");
            monedaDestino = scanner.next();
            if (monedaDestino.equals("EUR")) {
                cantidadConvertida = cantidad * tasaJPYEUR;
            } else if (monedaDestino.equals("USD")) {
                cantidadConvertida = cantidad * tasaJPYUSD;
            }
        }
        
        // Imprimimos el resultado
        System.out.printf("%.2f %s son %.2f %s\n", cantidad, monedaOrigen, cantidadConvertida, monedaDestino);
    }
}
