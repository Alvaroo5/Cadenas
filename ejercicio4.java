/*Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.*/
package Cadenas;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] arg) {
		String frase;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase:");
		frase=sc.nextLine();
		int contador = 0;
		
		for(int i = 0; i<frase.length(); i++) {
			if(frase.charAt(i)==' ')
				contador++;
		}
		System.out.println(contador);
	}

}
