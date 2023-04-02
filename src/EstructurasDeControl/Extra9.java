package EstructurasDeControl;

/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */

import java.util.Scanner;

public class Extra9 {

    public static void main(String[] args) {
        int div, cos, res, cant=0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese 2 numeros: ");
            cos = leer.nextInt();
            div = leer.nextInt();
        }while(div <= 1 && cos <= 1);

        do {
            res = cos - div;
            cos = res;
            cant++;
        }while(res > div);

        System.out.println("El resto es: " + res);
        System.out.println("El cociente es: " + cant);

    }
}
