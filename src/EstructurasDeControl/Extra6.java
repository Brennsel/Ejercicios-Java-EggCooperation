/*
 Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {

        int cant;
        float num, sumaTotal = 0, sumaCondicion = 0, cantCondicion = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas:");
        cant = leer.nextInt();

        for (int i = 0; i < cant; i++) {

            System.out.println("Ingrese la altura de la persona:");
            num = leer.nextFloat();

            if (num < 1.6f) {
                sumaCondicion += num;
                cantCondicion++;
                sumaTotal += num;
            } else {
                sumaTotal += num;
            }
        }

        System.out.println("Promedio de estaturas que se encuentran debajo de 1.6 mts.: " + (sumaCondicion / cantCondicion) + " mts.");
        System.out.println("Promedio de estaturas en general: " + (sumaTotal / cant) + " mts.");
    }
}
