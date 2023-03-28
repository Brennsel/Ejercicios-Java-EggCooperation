package Intro;


import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */

/**
 *
 * @author BrennSel
 */
public class Ej5 {
    
    public static void main(String[] args){
        
        int num;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero:");
        num = teclado.nextInt();
        
        System.out.println("El doble es: " + Math.multiplyExact(2, num) + " , el triple es: " + Math.multiplyExact(3, num) + " y su raiz cuadrada es: " + Math.sqrt(num));
    }
            
}
