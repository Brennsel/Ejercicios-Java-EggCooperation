package SubProgramas;

import java.util.Scanner;

/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número es múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
public class Procedimiento {

    public static void main(String[] args) {

        int num1, num2;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numero:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int n1, int n2) {

        if (n1 % n2 == 0) {
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número no es múltiplo del segundo");
        }

    }

}