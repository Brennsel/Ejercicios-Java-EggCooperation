package Arreglos;

import java.util.concurrent.ThreadLocalRandom;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
public class Ej3 {

    public static void main(String[] args) {

        int aux, d1=0, d2=0, d3=0, d4=0, d5=0;
        int[] vector = new int[10];

        for (int i = 0; i < 10; i++) {
            vector[i] = ThreadLocalRandom.current().nextInt(0, 100000);
        }

        for (int i=0; i<10; i++){
            System.out.println("[" +vector[i] + "]");
        }

        for(int i=0; i<10; i++){
            int digitos=0;
            aux = vector[i];

            while(aux!=0){
                aux = aux/10;
                digitos++;
            }

            switch (digitos){
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
            }

        }

        System.out.println("La cantidad de numeros con un digito es: " +d1);
        System.out.println("La cantidad de numeros con dos digitos es: " +d2);
        System.out.println("La cantidad de numeros con tres digitos es: " +d3);
        System.out.println("La cantidad de numeros con cuatro digitos es: " +d4);
        System.out.println("La cantidad de numeros con cinco digitos es: " +d5);

    }
}
