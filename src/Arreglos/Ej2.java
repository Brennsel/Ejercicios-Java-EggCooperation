package Arreglos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra repetido.
  */
public class Ej2 {

     public static void main(String[] args) {

         int num;
         int c=0;
         int[] vector = new int [10];
         Scanner leer = new Scanner(System.in);

         for(int i=0; i<10; i++){
             vector[i]= ThreadLocalRandom.current().nextInt(0, 6);
         }

         for(int i=0; i<10; i++){
             System.out.println("[" + vector[i] +"]");
         }

         System.out.println("Ingrese el numero a buscar de 1 a 5:");
         num = leer.nextInt();

             for(int i =0; i < 10; i++){
                 if(vector[i]==num){
                     if (c==0){
                         System.out.println("El valor esta en la posicion : "+ i);
                     }
                     c++;
                 }
             }

             if(c>1) {
                 System.out.println("El valor se encuentra repetido: " + c);
             }
         }
     }

