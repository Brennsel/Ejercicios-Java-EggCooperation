package EstructurasDeControl;

/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
public class Extra12 {
    public static void main(String[] args) {
        int c = 0, d = 0, u = 0;
        String c2, d2, u2;

        do  {
            c2 = String.valueOf(c);
            d2 = String.valueOf(d);
            u2 = String.valueOf(u);

            if(c2.equals("3")){
                c2 = "E";
            }
            if(d2.equals("3")){
                d2 = "E";
            }
            if(u2.equals("3")){
                u2 = "E";
            }

            System.out.println(c2 + "-" + d2 + "-" + u2);

            u++;

            if(u>9){
                u=0;
                d++;
            }
            if(d>9){
                d=0;
                c++;
            }
        }while(c<10);
    }

}
