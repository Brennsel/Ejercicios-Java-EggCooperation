package Arreglos;

import java.util.Scanner;

/*
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
public class Extra2 {

    public static void main(String[] args) {

        int n;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los vectores: ");
        n = leer.nextInt();
        System.out.println("===============================================================");

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        cargarVector(vector1, n);
        cargarVector(vector2, n);
        System.out.println("\nVECTOR 1");
        mostrarVector(vector1, n);
        System.out.println("\nVECTOR 2");
        mostrarVector(vector2, n);

        if (compararVectores(vector1, vector2, n)) {
            System.out.println("\nLos vectores son iguales");
        } else {
            System.out.println("\nLos vectores NO son iguales");
        }

    }

    private static void cargarVector(int[] vector, int n) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los valores del vector, posicion " + i + ": ");
            vector[i] = leer.nextInt();
        }

        System.out.println("===============================================================");
    }

    private static void mostrarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
    }

    private static boolean compararVectores(int[] vector1, int[] vector2, int n) {

        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }


}
