package Arreglos;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
public class Extra1 {

    public static void main(String[] args) {

        int n, suma=0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese el tamaño del vector: ");
            n = leer.nextInt();
        }while(n<1);

        int[] vector = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Ingrese el valor de la posicion: " +(i+1));
             vector[i] = leer.nextInt();
             suma+=vector[i];
        }

        System.out.println("La suma es:" +suma);
    }
}
