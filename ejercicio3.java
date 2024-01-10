/*Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.*/
package Cadenas;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Introduce una frase:");
		frase=sc.nextLine();                 
		
		int posCentral = frase.length()/2;
		
		System.out.println("Longitud cadena"+frase.length());
		
	}
	
}
