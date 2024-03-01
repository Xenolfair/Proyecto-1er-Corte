package classExcercises;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*Ejercicio de Conversión de Moneda:
Escribe un programa en Java que permita al usuario convertir una cantidad de dinero
de una moneda a otra. El programa debe pedir al usuario ingresar la cantidad de dinero
en una moneda (por ejemplo, dólares) y la tasa de cambio a la otra moneda (por ejemplo, euros).
 Luego, debe realizar la conversión y mostrar el resultado.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your currency: " + "\n" + "1. COP" + "\n" + "2. EUR" + "\n" + "3. USD " + "\n" + "-->");
        int userIn = scanner.nextInt();

        System.out.println("Enter the amount of money: ");
        float userValue = scanner.nextFloat();

        System.out.print("Choose the currency you are looking for" + "\n" + "1. COP" + "\n" + "2. EUR" + "\n" + "3. USD" + "\n" + "-->");
        int userOut = scanner.nextInt();

        float userElection;
        float copUsd = 3918;
        float copEur = 4265;
        float value;

        switch (userIn){
            case 1:
                if (userOut == 2){
                    value = (userValue / copEur);
                    System.out.print(userValue + " COP are equivalent to " + value + " EUR!");
                } else {
                    if(userOut == 3){
                        value = (userValue / copUsd);
                        System.out.print(userValue + " COP are equivalent to " + value + " USD!");
                    } else {
                        System.out.print("Enter a currency different from the initial one!");
                    }
                }
                break;
            case 2:
                if (userOut == 1){
                    value = (userValue * copEur);
                    System.out.print(userValue + " EUR are equivalent to " + value + " COP!");
                } else {
                    if(userOut == 3){
                        value = ((userValue * copEur)/copUsd);
                        System.out.print(userValue + " EUR are equivalent to " + value + " USD!");
                    } else {
                        System.out.print("Enter a currency different from the initial one!");
                    }
                }
                break;
            case 3:
                if (userOut == 1){
                    value = (userValue * copUsd);
                    System.out.print(userValue + " USD are equivalent to " + value + " COP!");
                } else {
                    if(userOut == 2){
                        value = ((userValue * copUsd)/copEur);
                        System.out.print(userValue + " USD are equivalent to " + value + " EUR!");
                    } else {
                        System.out.print("Enter a currency different from the initial one!");
                    }
                }
                break;
            default:
                System.out.print("Enter a valid number: 1, 2 o 3!");
                break;
        };
    };
}
