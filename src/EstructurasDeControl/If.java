/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.

 */
package EstructurasDeControl;

import java.util.Scanner;

/**
 *
 * @author brenn
 */
public class If {

    public static void main(String[] args) {

        int num1, num2;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos son mayores a 25");
        } else if (num1 > 25) {
            System.out.println("El numero 1 es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("El numero 2 es mayor a 25");
        } else {
            System.out.println("Ninguno es mayor a 25");
        }

    }

}
