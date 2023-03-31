/*
 Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuación solicite números al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        int limite, nro, suma = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un valor limite:");
            limite = leer.nextInt();
        } while (limite < 0);

        while (suma < limite) {
            System.out.println("Ingrese un numero:");
            nro = leer.nextInt();
            suma += nro;
        }
        System.out.println(suma);
    }
}
