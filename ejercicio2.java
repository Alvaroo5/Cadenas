/*Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra introducida sea "fin" escrita con cualquier 
combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.*/
package Cadenas;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] arg) {
		String palabra;
		String frase="";
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Introduce una palabra: ");
			palabra=sc.next();
			frase+=palabra;
			frase+=" ";
		}while(!palabra.equalsIgnoreCase("fin"));
		String fraseFinal = frase.substring(0, frase.length()-4);
		System.out.println("La frase introducida es: "+fraseFinal);
	}
	
}
