/*
 Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        String cadena;
        int correctas = 0, incorrectas = 0;

        Scanner leer = new Scanner(System.in);

        do {

            System.out.println("Ingrese un codigo:");
            cadena = leer.nextLine();

            if (!cadena.equals("&&&&&")) {

                if (cadena.length() >= 2 && cadena.length() <= 5) {
                    if (cadena.charAt(0) == 'X' && cadena.charAt(cadena.length() - 1) == 'O') {
                        correctas++;
                    } else {
                        incorrectas++;
                    }
                } else {
                    incorrectas++;
                }
            }

        } while (!cadena.equals("&&&&&"));

        System.out.println("correctas:" + correctas);
        System.out.println("incorrectas:" + incorrectas);

    }

}
