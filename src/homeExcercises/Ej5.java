package homeExcercises;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Ejercicio de Suma de Dígitos:
Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
Luego, suma todos los dígitos del número y muestra el resultado.
Ejemplo: Usuario ingresa 12 → El programa retorna 3
SumDigitos = 1+2= 3
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("--> Enter your whole number: ");

        int userNum = scanner.nextInt();
        int sumNum = 0;

        for (int tempNum = userNum; tempNum > 0; tempNum = tempNum / 10) {
            int digit = tempNum % 10;
            sumNum = sumNum + digit;

        }
        System.out.println("The sum of all digits is: " + sumNum);
        scanner.close();
    }
}
