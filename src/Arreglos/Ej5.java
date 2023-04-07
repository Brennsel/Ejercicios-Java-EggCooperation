package Arreglos;

/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ej5 {

    public static void main(String[] args) {

        int[][] matrizA = new int[3][3];

        cargarMatriz(matrizA);

        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz traspuesta de A:");
        mostrarTraspuesta(matrizA);

        if(validarAntisimetrica(matrizA)){
            System.out.println("\nLa matriz es antisimentrica");
        }else{
            System.out.println("\nLa matriz no es antisimetrica");
        }
    }


    private static void cargarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 20 + 10);
            }
        }
    }

    /*
    private static void cargarMatriz(int[][] matriz) {

        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
    }
    */

    private static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

    private static void mostrarTraspuesta(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }

    }

    private static boolean validarAntisimetrica(int[][] matrizA) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrizA[i][j] + matrizA[j][i] != 0) {
                    return false;
                }

            }

        }
        return true;
    }
}