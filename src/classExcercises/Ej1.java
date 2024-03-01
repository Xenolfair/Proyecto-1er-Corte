package classExcercises;

import java.util.Scanner;

public class Ej1 {
    /*Ejercicio de Verificación de Año Bisiesto:
Crea un programa en Java que solicite al usuario ingresar un
año y determine si es un año bisiesto o no. Un año bisiesto es aquel
divisible por 4, excepto aquellos divisibles por 100 pero no por 400.
Por ejemplo, 2000 y 2400 son años bisiestos, mientras que 1800, 1900
 y 2100 no lo son.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print("---> " + year + " is a leap year!");
        } else {
            System.out.print(year + " is NOT a leap year!");
        };
    };
};
