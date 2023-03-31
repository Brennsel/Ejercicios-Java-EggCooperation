/*
 Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();

        if (frase.charAt(0) == 'A' || frase.charAt(0) == 'a') {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}
