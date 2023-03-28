package Intro;


import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java
 */

/**
 *
 * @author Brennsel
 */
public class Ej3 {
    
    public static void main(String[] args){
        
        String frase;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        frase = teclado.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
