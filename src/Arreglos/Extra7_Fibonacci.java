package Arreglos;

/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3), Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y
que calcule la serie hasta llegar a ese valor.
 */

import java.util.Scanner;

public class Extra7_Fibonacci {

    public static void main(String[] args) {

        int n;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el termino que desea calcular:");
        n = leer.nextInt();

        cargarVector(n);
    }

    private static void cargarVector(int n) {

        int[] vector = new int[n];

        vector[0] = 1;

        if (n > 1) {

            vector[1] = 1;

            for(int i=2; i<n; i++){

                vector[i]=vector[i-1]+vector[i-2];
            }

            System.out.print("La sucesion de Fibonacci hasta el termino " + n + " es: ");
            for (int j=0; j<n; j++) {

                if(j!=n-1) {
                    System.out.print(vector[j] + ", ");
                }else{
                    System.out.print(vector[j] + ".");
                }
            }

        } else{
            System.out.println("La sucesion de Fibonacci hasta el termino " + n + " es: " +vector[0]);
        }
    }
}

