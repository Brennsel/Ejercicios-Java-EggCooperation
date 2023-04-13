package Arreglos;

import java.util.Scanner;
/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
 sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
 y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
 es decir, están entre el 1 y el 9.
 */

public class Ej6 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        cargarMatriz(matriz);
        mostrarMatriz(matriz);

        if (validarMagica(matriz)) {

            System.out.println("\nLa matriz ingresada es magica");
        } else {

            System.out.println("\nLa matriz ingresada NO es magica");

        }

    }

    private static void cargarMatriz(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los valores de la matriz entre 1 y 9:");

        for (int i = 0; i < 3; i++) {

            System.out.println("Valor de la fila " + (i + 1));

            for (int j = 0; j < 3; j++) {

                System.out.print(" columna " + (j + 1) + " : ");

                do {

                    matriz[i][j] = leer.nextInt();

                    if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                        System.out.println("Valor incorrecto.");
                    }

                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }

    }

    private static void mostrarMatriz(int[][] matriz) {

        System.out.println("\nLa matriz ingresada es:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }

            System.out.println(" ");
        }

    }

    private static boolean validarMagica(int[][] matriz) {

        int diagonal = 0, contradiagonal = 0, fila, columna, k = 2;

        for (int i = 0; i < 3; i++) {

            diagonal += matriz[i][i];

        }

        for (int i = 0; i < 3; i++) {

            contradiagonal += matriz[i][k];
            k--;
        }

        for (int i = 0; i < 3; i++) {

            fila = 0;
            columna = 0;

            for (int j = 0; j < 3; j++) {

                fila += matriz[i][j];
                columna += matriz[j][i];

            }

            if (fila != columna || fila != diagonal || diagonal != contradiagonal) {
                return false;
            }
        }

        return true;
    }
}
