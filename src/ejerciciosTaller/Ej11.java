package ejerciciosTaller;

import java.util.Scanner;
import java.util.Vector;
public class Ej11 {
    public static void main(String[] args) {
        /*Suma de elementos:
        Escribir un programa que calcule la suma de todos los elementos en un vector de enteros.*/

        Scanner scanner = new Scanner(System.in);
        Vector<Integer> userNum = new Vector<>();
        int numPrev = 0;
        int sumNum = 0;

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
            System.out.println(userNum.get(i));
            numPrev = numPrev + userNum.get(i);
        }
        System.out.println("The sum of all elements in the vector is: " + numPrev);
    }
}
