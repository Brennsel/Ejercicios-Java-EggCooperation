package Intro;

/* 
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de la suma
*/


import java.util.Scanner;

/**
 *
 * @author Brennsel
 */
public class Ej1 {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese dos numero enteros:");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        
        System.out.print("La suma es: ");   
        System.out.println(num1 + num2);   
    }
    
}
