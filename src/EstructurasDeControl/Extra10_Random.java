package EstructurasDeControl;

/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */

import java.util.Scanner;

public class Extra10_Random {

    public static void main(String[] args) {
        double num1, num2, result, ingreso;
        int max=3, min=0, rango;
        boolean esCorrecto=false;
        Scanner leer = new Scanner(System.in);

        rango = (max - min) + 1;
        num1 = (int)(Math.random()*rango) + min;
        num2 = (int)(Math.random()*rango) + min;

        result = num1 * num2;

        do {
            System.out.println("Ingrese la respuesta");
            ingreso = leer.nextInt();

            if(ingreso == result){
                System.out.println("Respuesta correcta");
                esCorrecto=true;
            }else{
                System.out.println("Respuesta incorrecta");
            }
        }while(!esCorrecto);
    }
}
