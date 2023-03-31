/*
 Realizar un programa que solo permita introducir frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();

        if (frase.length() == 8) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}
