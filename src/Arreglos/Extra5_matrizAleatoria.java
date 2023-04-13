package Arreglos;

import java.util.Scanner;

/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
public class Extra5_matrizAleatoria {

    public static void main(String[] args) {

        int n, m;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas: ");
        n = leer.nextInt();

        System.out.print("Ingrese la cantidad de columnas: ");
        m = leer.nextInt();

        int[][] matriz = new int[n][m];

        cargarMatriz(matriz, n, m);
        mostrarMatriz(matriz, n, m);
    }

    private static void cargarMatriz(int[][] matriz, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                matriz[i][j] = (int) (Math.random() * 20 + 10);

            }
        }
    }

    private static void mostrarMatriz(int[][] matriz, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println(" ");
        }
    }
}
