package WorkshopExcercises;

import java.util.Scanner;
import java.util.Vector;

public class Ej13 {
    public static void main(String[] args) {
        /*Escribir un programa que encuentre el elemento máximo en un vector de enteros. es
        decir el número más grande*/
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> userNum = new Vector<>();

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

        int numMax = userNum.get(0);
        for(int i = 1; i < userNum.size(); i++){
            if (userNum.get(i) > numMax){
                numMax = userNum.get(i);
            }
        }
        System.out.println("The maximum number in the vector is: " + numMax);
        scanner.close();
    }
}
