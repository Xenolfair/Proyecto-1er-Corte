package classExcercises;

import java.util.Scanner;

public class EjPassword {
    public static void main(String[] args) {
        /*Ejercicio de Validación de Contraseña:
Crea un programa en Java que pida al usuario ingresar una contraseña. El programa debe
verificar si la contraseña cumple con ciertos criterios de seguridad, como tener al menos
8 caracteres de longitud y contener
 al menos una letra mayúscula, una letra minúscula y un número.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("--> The password must be at least 8 characters long, with at least one capital letter, \n a lowercase letter and a number!\n");
        System.out.print("Enter your password: ");
        String password = scanner.next();
        char part;
        int countMay = 0;
        int countMin = 0;
        int countNum = 0;

        if (password.length() < 8){
            System.out.print("EROR!!!\n");
            System.out.print("--> The password must be at least 8 characters long!\n");
        }

        for (int i = 0; i < password.length(); i++) {
            part = password.charAt(i);
            String letter = String.valueOf(part);
            if (letter == letter.toUpperCase()){
                countMay++;
            }
            if (letter == letter.toLowerCase()){
                countMin++;
            }
            if (letter.matches("[0-9]*")){
                countNum++;
            }
        }

        if (countMay == 0){
            System.out.print("--> Password must have at least 1 uppercase letter\n");
        }
        if (countMin == 0){
            System.out.print("--> The password must have at least 1 lowercase letter\n");
        }
        if (countNum == 0){
            System.out.print("--> The password must have at least 1 number\n");
        }
        if (countMay != 0 && countMin != 0 && countNum != 0 && password.length() > 7){
            System.out.println("You are logged in!");
        }
    }
}
