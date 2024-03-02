package ejerciciosTaller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        /*14. Eliminar duplicados:
        Escribir un programa que elimine los elementos duplicados de una lista.*/

        Scanner scanner = new Scanner(System.in);
        List<Integer> userNum = new ArrayList<>();

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

        System.out.println("--> Removing duplicate elements from the vector...");

        for(int i = userNum.size() - 1; i >= 0; i--){
            int currentNum = userNum.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (currentNum == userNum.get(j)) {
                    userNum.remove(j);
                }
            }
        }
        for (int num : userNum) {
            System.out.println(num);
        }
    }
}
