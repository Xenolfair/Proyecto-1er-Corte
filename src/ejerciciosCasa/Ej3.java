package ejerciciosCasa;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*3. Ejercicio de Ordenamiento de Números (sin utilizar arreglos):
        Crea un programa en Java que solicite al usuario ingresar tres números enteros.
        Luego, muestra los números en orden ascendente, utilizando condicionales para
        determinar
        cuál es el mayor, el intermedio y el menor.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero entero: ");
        int userNum1 = scanner.nextInt();

        System.out.print("Ingresa tu segundo numero entero: ");
        int userNum2 = scanner.nextInt();

        System.out.print("Ingresa tu tercer numero entero: ");
        int userNum3 = scanner.nextInt();

        if(userNum2 == userNum1 && userNum2 == userNum3){
            System.out.print("¡Todos los numeros son iguales!");
            scanner.close();
        };

        if (userNum1 > userNum2){
            if(userNum2 > userNum3){
                System.out.println("Numero mayor: " + userNum1);
                System.out.println("Numero intermedio: " + userNum2);
                System.out.println("Numero menor: " + userNum3);
            } else {
                if(userNum1 > userNum3){
                    System.out.println("Numero mayor: " + userNum1);
                    System.out.println("Numero intermedio: " + userNum3);
                    System.out.println("Numero menor: " + userNum2);
                } else {
                    System.out.println("Numero mayor: " + userNum3);
                    System.out.println("Numero intermedio: " + userNum1);
                    System.out.println("Numero menor: " + userNum2);
                }
            }
            scanner.close();
        } else {
            if(userNum1 > userNum3){
                System.out.println("Numero mayor: " + userNum2);
                System.out.println("Numero intermedio: " + userNum1);
                System.out.println("Numero menor: " + userNum3);
            } else {
                if(userNum2 > userNum3){
                    System.out.println("Numero mayor: " + userNum2);
                    System.out.println("Numero intermedio: " + userNum3);
                    System.out.println("Numero menor: " + userNum1);
                } else {
                    System.out.println("Numero mayor: " + userNum3);
                    System.out.println("Numero intermedio: " + userNum2);
                    System.out.println("Numero menor: " + userNum1);
                }
            }
        }
    }
}
