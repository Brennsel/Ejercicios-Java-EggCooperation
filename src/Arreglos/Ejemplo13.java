package Arreglos;

import java.util.Scanner;

/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
public class Ejemplo13 {

    public static void main(String[] args) {

        String[] equipo = new String[4];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i<4; i++){
            System.out.println("Ingrese un nombre:");
            equipo[i] = leer.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("[" + equipo[i] + "]");
        }
    }
}
