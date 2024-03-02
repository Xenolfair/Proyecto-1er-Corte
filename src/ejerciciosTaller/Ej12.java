package ejerciciosTaller;

import java.util.Scanner;
import java.util.Vector;

public class Ej12 {
    public static void main(String[] args) {
        /*Producto de elementos pares:
    Escribir un programa que encuentre el producto de todos los números pares en un vector de
    enteros.*/

        Scanner scanner = new Scanner(System.in);
        Vector<Integer> userNum = new Vector<>();
        int numResult = 1;

        System.out.println("Enter numbers to add to the vector (enter 'end' to finish):");
        String input;

        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                userNum.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry, please enter a valid number or 'end' to finish");
            }
        }

        for(int i = 0; i < userNum.size(); i++){
            if (userNum.get(i) % 2 == 0){
                numResult = numResult * userNum.get(i);
            }
        }
        System.out.println("The sum of all elements in the vector is: " + numResult);
    }
}

