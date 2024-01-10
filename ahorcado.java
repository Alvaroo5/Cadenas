package Cadenas;

import java.util.Scanner;

public class ahorcado {
	public static boolean hayGuiones(char[] array) {
		for(char l:array) {
			if(l=='_')
				return true;
		}
		return false;
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		String palabraSecreta;
		int intentos;
	

		System.out.println("Jugaremos al ahorcado!!");
		System.out.println("Jugador 2, introduce cuantos intentos quiere:");
		intentos=sc.nextInt();		
		
		System.out.println("Jugador 1, introduce la palabra secreta: ");
		palabraSecreta=sc.next();
		
		char[] guiones = new char[palabraSecreta.length()];
		System.out.println("La palabra tiene "+palabraSecreta.length()+" letras");
		
		for(int i=0;i<guiones.length; i++) {
			guiones[i] = '_';
		}
		
		boolean terminado = false;
		do {
			System.out.println("Te quedan "+intentos+" intentos");
			System.out.println(guiones);
			System.out.println("Introduce una letra:");
			char letra = sc.next().charAt(0);
			boolean acertada = false;
			for(int i=0; i<palabraSecreta.length(); i++) {
				if(palabraSecreta.charAt(i) == letra) {
					guiones[i] = letra;
					acertada = true;
				}
			}
			if(!acertada) {
				System.out.println("No se encuentra esa letra");
				intentos--;
				if(intentos==0) {
					System.out.println("Agotaste los intentos");
					terminado = true;
				}
			}else {
				boolean juegoGanado = !hayGuiones(guiones);
				if(juegoGanado) {
					System.out.println("Has ganado");
					terminado=true;
				}
			}
		}while(!terminado);
	}
}