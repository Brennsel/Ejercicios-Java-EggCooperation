package EstructurasDeControl;

import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos
para averiguar la media de edad de los hijos de todas las familias.
 */
public class Extra14 {

    public static void main(String[] args) {
        int familias, hijos, suma=0;
        float prom;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de familias: ");
        familias = leer.nextInt();

        for (int i=0; i<familias; i++){
            System.out.println("Ingrese la cantidad de hijos para la familia " + (i+1));
            hijos = leer.nextInt();

            suma+=hijos;
        }

        prom = (float)suma/familias;

        System.out.println("El promedio de hijos es: " + prom);
    }
}
