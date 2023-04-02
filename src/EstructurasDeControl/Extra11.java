package EstructurasDeControl;

/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados
 */

import java.util.Scanner;

public class Extra11 {

    public static void main(String[] args) {

        int num, cant=1;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        num = leer.nextInt();

        while(num / 10 > 0){
            num = num / 10;
            cant++;
        }

        System.out.println("La cantidad de digitos es: " + cant);

    }

}
