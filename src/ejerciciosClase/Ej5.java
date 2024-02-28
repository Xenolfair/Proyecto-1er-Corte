package ejerciciosClase;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*Ejercicio de Cálculo de Intereses Compuestos:
Desarrolla un programa en Java que permita calcular el monto final de una inversión después
 de un cierto número de años,utilizando la fórmula de interés compuesto. El programa debe
 pedir al usuario ingresar la cantidad inicial invertida, la tasa
 de interés anual y el número de años. Luego, muestra el monto final.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad inicial invertida: ");
        float initialValue = scanner.nextFloat();

        System.out.println("Ingrese la tasa de interes anual: ");
        float interest = scanner.nextFloat();

        System.out.println("Ingrese el numero de años: ");
        float time = scanner.nextFloat();

        float value = (1 + interest / 100);
        double value2 = Math.pow(value, time);
        double finalValue = (value2 * initialValue);

        double profit = finalValue - initialValue;

        System.out.println("Monto final: " + finalValue + "\n");
        System.out.println("Ganancia de: " + profit + "\n");
    }
}
