/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor
 */
package EstructurasDeControl;

import java.util.Scanner;

public class For {
    
    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        for(int i=0; i<4; i++){
            System.out.println("Ingrese un numero entre 1 y 20:");
            num = leer.nextInt();
            
            if(num<1 || num>20){
                continue;
            }
            
            System.out.print(num +" ");
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}   
