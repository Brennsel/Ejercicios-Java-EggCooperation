package Intro;


import java.util.Scanner;

/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla
 */

/**
 *
 * @author Brennsel
 */
public class Ej2 {
    
    public static void main(String[] args){
        
        String nombre;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        nombre = teclado.nextLine();
        
        System.out.println("Su nombre es: " + nombre );
    }
            
    
}
