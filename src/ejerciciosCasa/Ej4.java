package ejerciciosCasa;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*Ejercicio de Generación de Números Aleatorios con Suma:
        Escribe un programa en Java que genere dos números enteros aleatorios entre 1 y 10 y
        luego solicite al usuario ingresar la suma de esos dos números. El programa debe verificar
        si la respuesta es correcta.*/

        Random random = new Random();

        int randomNum1 = random.nextInt(10) + 1;
        System.out.print("El primer numero es " + randomNum1 + "\n");

        int randomNum2 = random.nextInt(10) + 1;
        System.out.print("El segundo numero es " + randomNum2 + "\n");

        int correctSum = (randomNum1 + randomNum2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el resultado de la suma: ");
        int userSum = scanner.nextInt();

        if (userSum == correctSum){
            System.out.print("¡Tu respuesta es correcta!");
        } else {
            System.out.print("Tu respuesta es incorrecta, " + randomNum1 + " + " + randomNum2 + " = " + correctSum);
        }
    }
}
