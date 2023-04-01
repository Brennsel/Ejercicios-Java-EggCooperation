/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {

        int min, horas, dias;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los minutos:");
        min = leer.nextInt();

        horas = min / 60;
        dias = min / 1600;

        System.out.println("dias: " + dias);
        System.out.println("horas: " + horas);
    }
}
