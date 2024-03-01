package classExcercises;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*Ejercicio de Cálculo de Intereses Compuestos:
Desarrolla un programa en Java que permita calcular el monto final de una inversión después
 de un cierto número de años,utilizando la fórmula de interés compuesto. El programa debe
 pedir al usuario ingresar la cantidad inicial invertida, la tasa
 de interés anual y el número de años. Luego, muestra el monto final.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial amount invested: ");
        float initialValue = scanner.nextFloat();

        System.out.println("Enter the annual interest rate: ");
        float interest = scanner.nextFloat();

        System.out.println("Enter the number of years: ");
        float time = scanner.nextFloat();

        float value = (1 + interest / 100);
        double value2 = Math.pow(value, time);
        double finalValue = (value2 * initialValue);

        double profit = finalValue - initialValue;

        System.out.println("Final amount: " + finalValue + "\n");
        System.out.println("Gain of: " + profit + "\n");
    }
}
