package EstructurasDeControl;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */

import java.util.Scanner;

public class Extra8 {

    public static void main(String[] args) {
        int num, cant=0, pares=0, impares=0;

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();

            if(num % 5 != 0 && num >= 0 || num == 0){
                cant++;

                if(num % 2 == 0){
                    pares++;
                }else{
                    impares++;
                }
            }

        }while (num % 5 != 0 || num == 0);

        System.out.println("Cantidad de leidos: " + cant);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }

}
