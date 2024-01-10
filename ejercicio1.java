/*Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.*/
package Cadenas;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		String palabra1;
		String palabra2;
		
		System.out.println("Introduce una primera palabra: ");
		palabra1=sc.next();
		
		System.out.println("Introduce una segunda palabra: ");
		palabra2=sc.next();
		
		if (palabra1.length() < palabra2.length()) {
            System.out.println("La palabra más corta es: " + palabra1);
        } else if (palabra1.length() > palabra2.length()) {
            System.out.println("La palabra más corta es: " + palabra2);
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }
		
	}
	
}
