package EstructurasDeControl;

/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”
*/

import java.util.Scanner;

public class Extra7_2 {
    public static void main(String[] args) {
        int n, num, cant = 0, min = 0, max = 0, suma = 0;
        float prom = 0;

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese la cantidad de numeros:");
            n = leer.nextInt();
        } while (n <= 0);

        do{
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();

            if (cant == 0) {
                min = num;
                max = num;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            suma += num;

            cant++;

        }while(cant < n);

        prom = (float) suma / cant;

        System.out.println("El promedio es: " + prom);
        System.out.println("El maximo es: " + max);
        System.out.println("El minimo es: " + min);
    }
}
