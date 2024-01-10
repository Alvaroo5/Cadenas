/*Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra. 
El programa debe escribir "Acertaste" o "Fallaste".*/
package Cadenas;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseña;
        String intento;
        
        System.out.print("Jugador 1, introduce la contraseña: ");
        contraseña = scanner.nextLine();

        System.out.println("Pistas:");
        System.out.println("- La contraseña tiene " + contraseña.length() + " caracteres.");
        System.out.println("- La primera letra es: " + contraseña.charAt(0));
        System.out.println("- La última letra es: " + contraseña.charAt(contraseña.length() - 1));

        System.out.print("Jugador 2, adivina la contraseña: ");
        intento = scanner.nextLine();

        if (intento.equals(contraseña)) {
            System.out.println("¡Acertaste! La contraseña es correcta.");
        } else {
            System.out.println("Fallaste. La contraseña es: " + contraseña);
        }
    }

}
