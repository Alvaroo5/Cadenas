/*En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.*/
package Cadenas;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] arg) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Jugador 1, introduce la contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.println("Pistas:");  
        System.out.println("- La contraseña tiene " + contraseña.length() + " caracteres.");
        System.out.println("- La primera letra es: " + contraseña.charAt(0));
        System.out.println("- La última letra es: " + contraseña.charAt(contraseña.length() - 1));

        System.out.print("Jugador 2, adivina la contraseña: ");
        String intento = scanner.nextLine();
        
        if(contraseña.compareTo(intento)<0) {
        	System.out.println("Es ");
        }else if(contraseña.compareTo(intento)>0) {
        	
        }else {
        	System.out.println("Es igual");
        }

        if (intento.equals(contraseña)) {
            System.out.println("¡Acertaste! La contraseña es correcta.");
        } else {
            System.out.println("Fallaste. La contraseña correcta era: " + contraseña);
            contraseña.compareTo(intento);
        }
		
	}

}
