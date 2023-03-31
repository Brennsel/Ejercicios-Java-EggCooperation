/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
    
    int num, cant=0, suma=0;
    Scanner leer = new Scanner(System.in);
    
    do{
       System.out.println("Ingrese un numero:");
       num = leer.nextInt();
       cant++;
       if(num==0){
           System.out.println("Se capturó el numero cero");
           break;
       }else if(num>0){
           suma+=num;
       }
    }while(cant!=20);
    
        System.out.println("La suma es:" +suma);
              
    }
}