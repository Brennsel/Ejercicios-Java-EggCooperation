package SubProgramas;

import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.

 */
public class Ej2 {

    public static void main(String[] args) {

        int cant;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas a ingresar:");
        cant = leer. nextInt();

        pedirDatos(cant);

    }

    public static void pedirDatos(int cant){

        String nombre, respuesta;
        int edad;

        Scanner leer = new Scanner(System.in);

        for(int i=0; i<cant; i++) {
            System.out.println("Ingrese nombre:");
            nombre = leer.nextLine();

            System.out.println("Ingrese la edad:");
            edad = leer.nextInt();

            System.out.println("**************************************");
            System.out.println("Nombre:" +nombre);
            System.out.println("Edad:" +edad);

            if(edad>=18){
                System.out.println("Es mayor de edad");

            } else {
                System.out.println("Es menor de edad");
            }
            System.out.println("**************************************");
            System.out.println("Desea continuar?");

            do {
                respuesta = leer.nextLine();
                } while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

            if(respuesta.equalsIgnoreCase("no")){
                break;
            }

        }
    }
}
