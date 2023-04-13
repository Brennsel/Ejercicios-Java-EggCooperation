package Arreglos;

import java.util.Scanner;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */
public class Extra6_Sopa {

    public static void main(String[] args) {

        String[][] matriz = new String[20][20];
        String[] vectorFila = new String[20];

        cargarSopa(matriz, vectorFila);
        cargarAleatorios(matriz);
        mostrarMatriz(matriz);

    }

    private static void cargarSopa(String[][] matriz, String[] vector) {

        String palabra, letra;
        int fila, columna, cont;
        Scanner leer = new Scanner(System.in);

        for (int k = 0; k < 5; k++) {

            do {

                System.out.println("Ingrese una palabra (min 3 caract./ max 5 caract.):");
                palabra = leer.nextLine();

                if (palabra.length() < 3 || palabra.length() > 5) {
                    System.out.println("Palabra incorrecta");
                }

            } while (palabra.length() < 3 || palabra.length() > 5);

            do {
                fila = (int) (Math.random() * 19 + 0);

            } while (vector[fila] != null);

            vector[fila] = "X";

            columna = (int) (Math.random() * (20 - palabra.length()) + 0);

            cont = 0;

            for (int j = columna; j < columna + palabra.length(); j++) {

                letra = palabra.substring(cont, cont + 1);
                matriz[fila][j] = letra;
                cont++;

            }
        }
    }

    private static void cargarAleatorios(String[][] matriz) {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (matriz[i][j] == null) {

                    matriz[i][j] = String.valueOf((int) (Math.random() * 9 + 0));
                }

            }
        }

    }

    private static void mostrarMatriz(String[][] matriz) {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}