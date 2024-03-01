package homeExcercises;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        /*3. Ejercicio de Ordenamiento de Números (sin utilizar arreglos):
        Crea un programa en Java que solicite al usuario ingresar tres números enteros.
        Luego, muestra los números en orden ascendente, utilizando condicionales para
        determinar
        cuál es el mayor, el intermedio y el menor.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first whole number: ");
        int userNum1 = scanner.nextInt();

        System.out.print("Enter your second whole number: ");
        int userNum2 = scanner.nextInt();

        System.out.print("Enter your third whole number: ");
        int userNum3 = scanner.nextInt();

        if(userNum2 == userNum1 && userNum2 == userNum3){
            System.out.print("All numbers are the same!");
            scanner.close();
        };

        if (userNum1 > userNum2){
            if(userNum2 > userNum3){
                System.out.println("Largest number: " + userNum1);
                System.out.println("Intermediate number: " + userNum2);
                System.out.println("Smaller number: " + userNum3);
            } else {
                if(userNum1 > userNum3){
                    System.out.println("Largest number: " + userNum1);
                    System.out.println("Intermediate number: " + userNum3);
                    System.out.println("Smaller number: " + userNum2);
                } else {
                    System.out.println("Largest number: " + userNum3);
                    System.out.println("Intermediate number: " + userNum1);
                    System.out.println("Smaller number: " + userNum2);
                }
            }
            scanner.close();
        } else {
            if(userNum1 > userNum3){
                System.out.println("Largest number: " + userNum2);
                System.out.println("Intermediate number: " + userNum1);
                System.out.println("Smaller number: " + userNum3);
            } else {
                if(userNum2 > userNum3){
                    System.out.println("Largest number: " + userNum2);
                    System.out.println("Intermediate number: " + userNum3);
                    System.out.println("Smaller number: " + userNum1);
                } else {
                    System.out.println("Largest number: " + userNum3);
                    System.out.println("Intermediate number: " + userNum2);
                    System.out.println("Smaller number: " + userNum1);
                }
            }
        }
    }
}
