package SubProgramas;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.

 */
public class    Ej1 {

    public static void main(String[] args) {

        int num1, num2, opc, resultado=0;
        float resultado2=0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numero:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println("************************************");
        System.out.println(":::MENU:::");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("************************************");
        System.out.println("Ingrese una opcion:");
        opc = leer.nextInt();

        switch (opc){
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("El resultado es: " +resultado );
                break;

            case 2:
                resultado = restar(num1, num2);
                System.out.println("El resultado es: " +resultado );
                break;

            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("El resultado es: " +resultado );
                break;

            case 4:
                resultado2 = dividir(num1, num2);
                System.out.println("El resultado es: " +resultado2 );
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }

    public static int sumar(int n1, int n2) {

        return n1+n2;
    }

    public static int restar(int n1, int n2){

        return n1-n2;
    }

    public static int multiplicar(int n1, int n2){

        return n1*n2;
    }

    public static float dividir(int n1, int n2){

        return (float)n1/n2;
    }
}
