package homeExcercises;

import java.util.Random;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        /*Ejercicio de Generación de Números Aleatorios con Suma:
        Escribe un programa en Java que genere dos números enteros aleatorios entre 1 y 10 y
        luego solicite al usuario ingresar la suma de esos dos números. El programa debe verificar
        si la respuesta es correcta.*/

        Random random = new Random();

        int randomNum1 = random.nextInt(10) + 1;
        System.out.print("The first number is " + randomNum1 + "\n");

        int randomNum2 = random.nextInt(10) + 1;
        System.out.print("The second number is " + randomNum2 + "\n");

        int correctSum = (randomNum1 + randomNum2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the result of the sum: ");
        int userSum = scanner.nextInt();

        if (userSum == correctSum){
            System.out.print("Your answer is correct!");
        } else {
            System.out.print("Your answer is incorrect, " + randomNum1 + " + " + randomNum2 + " = " + correctSum);
        }
        scanner.close();
    }
}
