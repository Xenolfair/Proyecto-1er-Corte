package WorkshopExcercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ej16 {
    public static void main(String[] args) {
        /*16. . Eliminar claves:
        Escribir un programa que elimine todas las claves de un HashMap que tengan
        un valor menor que un número dado.*/

        Scanner scanner = new Scanner(System.in);

        // Create a HashMap for storing key-value pairs (Integer-String)
        Map<Integer, String> map = new HashMap<>();

        // Prompt user to enter map elements
        System.out.println("--> Enter the map elements (enter '-1' to finish):");
        int key;

        while (true) {
            System.out.print("Key (integer): ");
            if (!scanner.hasNextInt()) {
                System.out.println("The key must be an integer");
                scanner.nextLine(); // Consuming invalid input
                continue;
            }
            key = scanner.nextInt();
            scanner.nextLine(); // Consume the new pending line after nextInt()
            if (key == -1) {
                break;
            }
            System.out.print("Value (chain): ");
            String value = scanner.nextLine();
            map.put(key, value);
        }

        // Display the map entered by the user
        System.out.println("Map entered: " + map);

        System.out.println("--> Enter your minimum value: ");
        int minValue = scanner.nextInt();

        //entrySet() returns the properties of the map
        //put() inserts the value of the key and the value in the corresponding value
        Map<Integer, String> minMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (Integer.parseInt(entry.getValue()) >= minValue) {
                minMap.put(entry.getKey(), entry.getValue());
            }
        }

        // Display the map after changes
        System.out.println("Map after changes: " + minMap);
        scanner.close();
    }
}
