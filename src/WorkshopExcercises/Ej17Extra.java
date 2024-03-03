package WorkshopExcercises;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej17Extra {
    public static void main(String[] args) {
        /*Promedio de valores:
        Escribir un programa que tome un HashMap donde las claves son nombres de
        estudiantes y los valores son listas de calificaciones, y calcule el promedio de calificaciones
        para cada estudiante.*/

        Scanner scanner = new Scanner(System.in);

        // Create a HashMap for storing key-value pairs (Integer-String)
        Map<String, List<Double>> map = new HashMap<>();

        // Prompt user to enter map elements
        System.out.println("--> Enter the map elements (enter '-1' to finish):");
        String student;

        while (true) {
            System.out.print("Student name: ");
            student = scanner.nextLine();

            if (student.equals("end") ){
                break;
            }
            System.out.print("Qualifications (separated by spaces): ");
            String[] gradesInput = scanner.nextLine().split(" ");
            List<Double> grades = new ArrayList<>();

            for (String grade : gradesInput) {
                grades.add(Double.parseDouble(grade));
            }

            map.put(student, grades);
        }

        //average
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            String student1 = entry.getKey();
            List<Double> grades = entry.getValue();
            double sum = 0;
            for (Double grade : grades) {
                sum = sum + grade;
            }

            /*if (grades.isEmpty() == true){
                double average = 0;
            } else {
                double average = sum / grades.size();
            }*/
            double average = grades.isEmpty() ? 0 : sum / grades.size();
            System.out.println("Average of " + student1 + ": " + average);
        }
    }
}
