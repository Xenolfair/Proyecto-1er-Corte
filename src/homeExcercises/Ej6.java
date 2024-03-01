package homeExcercises;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        /*
        Ejercicio de Generación de Patrón de Asteriscos:
        Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
        Luego, muestra un patrón de asteriscos como el siguiente ejemplo, donde cada fila tiene el
        mismo número de asteriscos que el número ingresado:
        Ejemplo: Pista: Pueden usar un ciclo For y el caracter de salto de linea \n
        Si el usuario ingresa 4:
*
**
***
****
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your whole number: ");

        int userNum = scanner.nextInt();

        for(int i = 1; i <= userNum; i = i + 1) {
            for (int j = 1; j <= i; j = j + 1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
