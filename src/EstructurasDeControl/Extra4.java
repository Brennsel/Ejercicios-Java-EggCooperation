/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero entre 1 y 10:");
            num = leer.nextInt();
        } while (num < 1 || num > 10);

        if (num == 1 || num == 2 || num == 3) {
            for (int i = 0; i < num; i++) {
                System.out.print("I");
            }
            System.out.println(" "); //v 4 5 6 7 8
        } else if (num == 4) {
            System.out.println("IV");
        } else if (num == 5 || num == 6 || num == 7 || num == 8) {
            System.out.print("V");
            for (int i = 0; i < num - 5; i++) {
                System.out.print("I");
            }
            System.out.println(" ");
        } else {
            for (int i = 0; i < 10 - num; i++) {
                System.out.print("I");
            }
        }
        System.out.print("X");
        System.out.println(" ");
    }
}
