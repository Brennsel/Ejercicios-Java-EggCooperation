package Arreglos;

import java.util.Scanner;

/*
Crear una función que rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector
 */
public class Extra3 {

    public static void main(String[] args) {

        int n;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        System.out.println("===============================================================");

        int[] vector = new int[n];

        cargarVector(vector, n);

        System.out.println("\nVECTOR: ");
        mostrarVector(vector, n);

    }
    private static void cargarVector(int[] vector, int n) {

        for(int i=0; i<n; i++){

            vector[i]= (int) (Math.random() * 10 + 0);
        }
    }

    private static void mostrarVector(int[] vector, int n) {

        for(int i=0; i<n; i++){

            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
    }
}


