/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        int nota = 11;
        Scanner leer = new Scanner(System.in);

        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese una nota entre 0 y 10:");
            nota = leer.nextInt();
        }

    }

}
