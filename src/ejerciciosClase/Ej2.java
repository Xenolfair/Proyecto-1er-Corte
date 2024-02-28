package ejerciciosClase;

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
        System.out.print("¿Piedra(1), papel(2) o tijera(3)?: ");

        int randomNum = (int) (Math.random() * 3) + 1;
        int userElection = scanner.nextInt();
        int Election = randomNum;
        String ElectionTxt = "";
        String userElectionTxt;

        switch (Election){
            case 1:
                ElectionTxt = "piedra";
                break;
            case 2:
                ElectionTxt = "papel";
                break;
            case 3:
                ElectionTxt = "tijera";
                break;
        };

        System.out.print("Tu enemigo sacó " + ElectionTxt + "\n");

        if(Election == userElection){
            System.out.print("¡Empate!");
            scanner.close();
        };

        if(userElection == 1){
            if(Election == 2){
                System.out.print("¡Perdiste!");
            } else {
                System.out.print("¡Ganaste!");
            }
        };

        if(userElection == 2){
            if(Election == 1){
                System.out.print("¡Ganaste!");
            } else {
                System.out.print("¡Perdiste!");
            }
        };

        if(userElection == 3){
            if(Election == 2){
                System.out.print("¡Ganaste!");
            } else {
                System.out.print("¡Perdiste!");
            }
        };
    };
};
