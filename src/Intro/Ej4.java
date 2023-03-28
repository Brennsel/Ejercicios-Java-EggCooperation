package Intro;


import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

/**
 *
 * @author lusht
 */
public class Ej4 {
    
    public static void main(String[] args){
        
        float grados;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los grados centigrados:");
        grados = teclado.nextFloat();
        
        System.out.println("Su equivalente en grados Fahrenheit: " + 32+(9*grados/5) +"°F");
    }
            
}