/*Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre. Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y 
acentuadas). El resto de caracteres no se modifican.*/
package Cadenas;

import java.util.Scanner;

public class ejercicio5 {

	public static StringBuilder eliminarVocales(String nombreCompleto) {
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        StringBuilder resultado = new StringBuilder();
        for (char letra : nombreCompleto.toCharArray()) {
            if (vocales.indexOf(letra) == -1) {
                resultado.append(letra);
            }
        }

        return resultado;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        
        StringBuilder nombreSinVocales = eliminarVocales(nombreCompleto);

        
        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }

}
