package ejerciciosCasa;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        /*6. Ejercicio de Cálculo de Dígitos Repetidos en un Número:
        Desarrolla un programa en Java que solicite al usuario ingresar un número entero positivo y
        un dígito, y luego cuente y muestre cuántas veces aparece ese dígito en el número
        ingresado.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu numero entero: ");
        int userNum = scanner.nextInt();

        System.out.print("Ingresa tu digito: ");
        int userDigit = scanner.nextInt();

        int countDigit = 0;

        while (userNum > 0) {
            int currentDigit = userNum % 10;
            if (currentDigit == userDigit) {
                countDigit++;
            }
            userNum /= 10;
        }

        System.out.println("El digito aparece " + countDigit + " veces");
    }
}
