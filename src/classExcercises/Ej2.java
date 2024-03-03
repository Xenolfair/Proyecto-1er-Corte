package classExcercises;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
            /*Ejercicio de Juego de Piedra, Papel o Tijeras:
    Desarrolla un programa en Java que permita al usuario jugar al clásico juego
    de Piedra, Papel o Tijeras contra la computadora. El programa debe solicitar al
    usuario que elija una de las opciones (Piedra, Papel o Tijeras) y luego generar
    aleatoriamente la elección de la computadora. Luego, el programa debe determinar
    quién gana según las reglas del juego.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Stone(1), paper(2) o scissors(3)?: ");

        int randomNum = (int) (Math.random() * 3) + 1;
        int userElection = scanner.nextInt();
        int Election = randomNum;
        String ElectionTxt = "";
        String userElectionTxt;

        switch (Election){
            case 1:
                ElectionTxt = "stone";
                break;
            case 2:
                ElectionTxt = "paper";
                break;
            case 3:
                ElectionTxt = "scissors";
                break;
        };

        System.out.print("Your enemy took out " + ElectionTxt + "\n");

        if(Election == userElection){
            System.out.print("Tie!");
            userElection = 0;
            scanner.close();
        };

        if(userElection == 1){
            if(Election == 2){
                System.out.print("You lost!");
            } else {
                System.out.print("You won!");
            }
        };

        if(userElection == 2){
            if(Election == 1){
                System.out.print("You won!");
            } else {
                System.out.print("You lost!");
            }
        };

        if(userElection == 3){
            if(Election == 2){
                System.out.print("You won!");
            } else {
                System.out.print("You lost!");
            }
        };
        scanner.close();
    };
};
