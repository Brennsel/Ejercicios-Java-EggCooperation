package SubProgramas;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        float euro;
        String moneda;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros:");
        euro = leer.nextInt();

        System.out.println("Seleecione el tipo de moneda:");
        System.out.println("LIBRA, PESO o YEN");

        do {
            moneda = leer.nextLine();
        }while(!moneda.equalsIgnoreCase("libra") && !moneda.equalsIgnoreCase("peso") && !moneda.equalsIgnoreCase("yen"));

        convertirMoneda(euro, moneda);

    }

    public static void convertirMoneda(float euro, String tipo){

        float valor=0;

        switch (tipo.toLowerCase()){
            case "libra":
                valor= 0.86F;
                break;
            case "peso":
                valor= 1.28611F;
                break;
            case "yen":
                valor=129.852F;
                break;
        }
        System.out.println(+euro +"€ " +"= " +(valor*euro) + " " +tipo);
    }

}
