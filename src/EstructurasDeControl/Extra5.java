/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {

        double valorInicial, valorFinal = 0;
        String letra;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese la clase:");
            letra = leer.nextLine();
        } while (!letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("b") && !letra.equalsIgnoreCase("c"));

        System.out.println("Ingrese valor del tratamiento:");
        valorInicial = leer.nextFloat();

        if (letra.equalsIgnoreCase("a")) {
            valorFinal = valorInicial - (valorInicial * 0.5);
        } else if (letra.equalsIgnoreCase("b")) {
            valorFinal = valorInicial - (valorInicial * 0.35);
        } else if (letra.equalsIgnoreCase("c")) {
            valorFinal = valorInicial;
        }

        System.out.println("================================");
        System.out.println("Socio: " + letra);
        System.out.println("Valor del tratamiento: $" + valorInicial);
        System.out.println("Valor final a pagar: $" + valorFinal);
        System.out.println("================================");
    }
}
