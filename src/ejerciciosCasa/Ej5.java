package ejerciciosCasa;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*Ejercicio de Cálculo de Máximo Común Divisor (MCD):
        Desarrolla un programa en Java que solicite al usuario ingresar dos números enteros
        positivos y luego calcule y muestre su máximo común divisor (MCD).*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa tu segundo numero entero: ");
        int num2 = scanner.nextInt();

        int mcd = calcularMCD(num1, num2);

        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
