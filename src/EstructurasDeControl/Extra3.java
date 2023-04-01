/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Extra3 {
    
        public static void main(String[] args) {

        String letra;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra:");
        letra = leer.nextLine();
        
        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            
            System.out.println("Es vocal");
        }else{
            System.out.println("No vocal");
        }
    }
}
