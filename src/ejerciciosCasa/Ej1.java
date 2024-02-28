package ejerciciosCasa;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Ejercicio de Suma de Dígitos:
Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
Luego, suma todos los dígitos del número y muestra el resultado.
Ejemplo: Usuario ingresa 12 → El programa retorna 3
SumDigitos = 1+2= 3
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu numero entero: ");

        int userNum = scanner.nextInt();
        int userLength1 = 0;
        int userLength2 = 0;

        for(int i = 10; i <= userNum; i = i * 10) {
            userLength1 = userNum / i;
            userLength2 = userNum % i;
        }

        System.out.print(userLength1 + " + " + userLength2 + " = " + (userLength1 + userLength2));
    }
}
