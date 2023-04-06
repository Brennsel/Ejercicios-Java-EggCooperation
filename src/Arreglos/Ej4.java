package Arreglos;

/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */

public class Ej4 {
    public static void main(String[] args) {

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        cargarMatriz(matrizA);

        System.out.println("Matriz A: ");
        mostrarMatriz(matrizA);

        trasponerMatriz(matrizA, matrizB);

        System.out.println("Matriz B (Traspuesta de A):");
        mostrarMatriz(matrizB);

    }

    public static void cargarMatriz(int[][] matriz){

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matriz[i][j] = (int) (Math.random() * 20 + 10);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz){

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("[" + matriz[i][j] +"]");
            }
            System.out.println(" ");
        }
    }

    public static void trasponerMatriz(int[][] matrizA, int[][] matrizB){

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matrizB[i][j] = matrizA[j][i];
            }
        }
    }

}
