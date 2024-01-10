package Cadenas;
import java.util.Scanner;

public class Ahorcado2 {
    private static String palabraSecreta;
    private static char[] palabraActual;
    private static int intentosRestantes;
    private static char[] letrasIncorrectas;

    public static void main1(String[] arg) {
        // Inicializar el juego
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la palabra secreta: ");
        palabraSecreta = scanner.nextLine().toLowerCase(); // Convertir la palabra a minúsculas para evitar problemas de mayúsculas/minúsculas
        palabraActual = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraActual.length; i++) {
            palabraActual[i] = '_';
        }

        System.out.println("Ingresa el número de intentos permitidos: ");
        intentosRestantes = scanner.nextInt();
        letrasIncorrectas = new char[intentosRestantes];

        scanner.close();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mostrarTablero();
            System.out.println("Ingresa una letra: ");
            char letra = scanner.next().toLowerCase().charAt(0); // Convertir la letra a minúsculas

            if (letraIngresada(letra)) {
                System.out.println("Ya has ingresado esa letra. Intenta de nuevo.");
                continue;
            }

            if (palabraSecreta.contains(String.valueOf(letra))) {
                actualizarPalabraActual(letra);
                if (hasGanado()) {
                    mostrarTablero();
                    System.out.println("¡Felicidades! Has adivinado la palabra.");
                    juegoTerminado = true;
                }
            } else {
                letrasIncorrectas[intentosRestantes - 1] = letra;
                intentosRestantes--;

                if (intentosRestantes == 0) {
                    mostrarTablero();
                    System.out.println("¡Has perdido! La palabra era: " + palabraSecreta);
                    juegoTerminado = true;
                }
            }
        }

        scanner.close();
    }

    private void mostrarTablero() {
        System.out.println("Palabra actual: " + String.valueOf(palabraActual));
        System.out.println("Intentos restantes: " + intentosRestantes);
        System.out.print("Letras incorrectas: ");
        for (int i = 0; i < letrasIncorrectas.length - intentosRestantes; i++) {
            System.out.print(letrasIncorrectas[i] + " ");
        }
        System.out.println();
    }

    private boolean letraIngresada(char letra) {
        for (int i = 0; i < letrasIncorrectas.length - intentosRestantes; i++) {
            if (letrasIncorrectas[i] == letra) {
                return true;
            }
        }
        return false;
    }

    private void actualizarPalabraActual(char letra) {
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraActual[i] = letra;
            }
        }
    }

    private boolean hasGanado() {
        for (char c : palabraActual) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ahorcado2 juego = new Ahorcado2();
        juego.jugar();
    }
}