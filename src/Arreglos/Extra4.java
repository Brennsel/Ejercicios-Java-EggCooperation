package Arreglos;

import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
public class Extra4 {

    public static void main(String[] args) {

        float[][] notas = new float[10][4];
        float[] promedios = new float[10];

        cargarMatriz(notas);
        cargarVector(promedios);
        calcularPromedios(notas, promedios);
        contarPromedios(promedios);
    }

    private static void cargarVector(float[] vector) {

        for(int i=0; i<10; i++){
            vector[i] = 0;
        }
    }

    private static void cargarMatriz(float[][] notas) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese las notas (entre 1 y 10)");
        System.out.println("========================================");

        for(int i=0; i<10; i++){

            System.out.println("\nAlumno " +(i+1));

            for(int j=0; j<4; j++){

                System.out.print("Nota " + (j+1) +" : " );
                do {
                    notas[i][j] = leer.nextFloat();

                    if(notas[i][j]<1 || notas[i][j]>10){
                        System.out.print("Nota incorrecta. Ingrese nuevamente.");
                    }

                }while(notas[i][j]<1 || notas[i][j]>10);

            }

            System.out.println("========================================");
        }
    }

    private static void calcularPromedios(float[][] matriz, float[] vector) {

        for(int i=0; i<10; i++){
            for(int j=0; j<4; j++){

                switch (j){
                    case 0:
                        vector[i] += matriz[i][j]*0.1;
                        break;

                    case 1:
                        vector[i] += matriz[i][j]*0.15;
                        break;

                    case 2:
                        vector[i] += matriz[i][j]*0.25;
                        break;

                    case 3:
                        vector[i] += matriz[i][j]*0.5;
                        break;
                }
            }
        }
    }

    private static void contarPromedios(float[] vector) {

        int aprobados=0, desaprobados=0;

        for(int i=0; i<10; i++){
            if(vector[i]<7){
                desaprobados++;
            }else{
                aprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " +aprobados);
        System.out.println("Cantidad de desaprobados: " +desaprobados);
    }

}
