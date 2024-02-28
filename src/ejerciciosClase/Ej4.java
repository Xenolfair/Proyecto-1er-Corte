package ejerciciosClase;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*Ejercicio de Validación de Contraseña:
Crea un programa en Java que pida al usuario ingresar una contraseña. El programa debe
verificar si la contraseña cumple con ciertos criterios de seguridad, como tener al menos
8 caracteres de longitud y contener
 al menos una letra mayúscula, una letra minúscula y un número.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("--> ¡La contraseña debe de tener al menos 8 caracteres, al menos una letra mayuscula,\n una minuscula y un numero!\n");
        System.out.print("Ingresa tu contraseña: ");
        String password = scanner.next();
        char letra;
        int countMay = 0;
        int countMin = 0;
        int countNum = 0;

        if (password.length() < 8){
            System.out.print("EROR!!!\n");
            System.out.print("--> ¡La contraseña debe de tener al menos 8 caracteres!\n");
        }

        for (int i = 0; i < password.length(); i++) {
            letra = password.charAt(i);
            String letter = String.valueOf(letra);
            if (letter == letter.toUpperCase()){
                countMay++;
            }
            if (letter == letter.toLowerCase()){
                countMin++;
            }
            if (letter.matches("[0-9]*")){
                countNum++;
            }
            /*System.out.println(letra);*/
        }

        if (countMay == 0){
            System.out.print("--> ¡La contraseña debe de tener al menos 1 letra mayuscula\n");
        }
        if (countMin == 0){
            System.out.print("--> ¡La contraseña debe de tener al menos 1 letra minuscula\n");
        }
        if (countNum == 0){
            System.out.print("--> ¡La contraseña debe de tener al menos 1 numero\n");
        }
        if (countMay != 0 && countMin != 0 && countNum != 0 && password.length() > 7){
            System.out.println("¡Has iniciado sesion!");
        }
        /*for (int i = password.length(); i > 0; i--) {
            char digit = password.charAt(password.length() - 1);
            System.out.println(digit);
        }*/
    }
}
