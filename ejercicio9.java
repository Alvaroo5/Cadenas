/*Realizar un programa que haga lo siguiente:

a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
b) Mostrar por consola su capacidad y longitud.
c) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Chicharrones de Chiclana" y mostrarla por consola.
d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones" y mostrarla por consola. El número entero 5000 debe estar almacenado en un int inicialmente.
e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
f) Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese String por consola.
g) Mostrar por  consola  la capacidad y longitud del StringBuilder final.
h) Realizar el mismo ejercicio con la clase StringBuffer.
*/
package Cadenas;

public class ejercicio9 {

	public static void main(String[] arg) {
		 StringBuilder stringBuilder = new StringBuilder("Alabí Alixar");
		 System.out.println(stringBuilder);
		 
		 System.out.println("Capacidad: " + stringBuilder.capacity());
		 
	     System.out.println("Longitud: " + stringBuilder.length());
	     
	     
	}

}
