/*
 Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        int nro1, nro2, opcion;
        String respuesta;
        boolean terminaPrograma = false;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese dos numeros positivos:");
            nro1 = leer.nextInt();
            nro2 = leer.nextInt();
        } while (nro1 < 0 || nro2 < 0);

        do {
            System.out.println("==================================");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Mulplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("==================================");
            System.out.println("Elija opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(nro1 + nro2);
                    break;
                case 2:
                    System.out.println(nro1 - nro2);
                    break;
                case 3:
                    System.out.println(nro1 * nro2);
                    break;
                case 4:
                    System.out.println(nro1 / nro2);
                    break;
                case 5:
                    System.out.println("¿Esta seguro que quiere terminar? S/N");
                    Scanner teclado = new Scanner(System.in);
                    respuesta = teclado.nextLine();

                    if (respuesta.equalsIgnoreCase("S")) {
                        terminaPrograma = true;
                    }
                    break;
                default:
                    System.out.println("incorrecto");
            }

        } while (terminaPrograma==false); //!terminaPrograma
    }
}
