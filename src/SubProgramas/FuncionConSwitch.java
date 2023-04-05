package SubProgramas;

import java.util.Scanner;

public class FuncionConSwitch {

    public static void main(String[] args) {

        String frase;

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese una frase terminada con un punto:");
            frase = leer.nextLine();
        } while (!frase.endsWith("."));

        System.out.println(codificar(frase));

    }

    public static String codificar(String frase) {

        int longitud = frase.length();
        String fraseCodificada="";
        char car, letra;

        for (int i = 0; i < longitud; i++) {

            car = frase.charAt(i);

            switch (car) {
                case 'a':
                    letra = '@';
                    break;
                case 'A':
                    letra = '@';
                    break;
                case 'e':
                    letra = '#';
                    break;
                case 'E':
                    letra = '#';
                    break;
                case 'i':
                    letra = '$';
                    break;
                case 'I':
                    letra = '$';
                    break;
                case 'o':
                    letra = '%';
                    break;
                case 'O':
                    letra = '%';
                    break;
                case 'u':
                    letra = '*';
                    break;
                case 'U':
                    letra = '*';
                    break;
                default:
                    letra = car;
                    break;
            }

            fraseCodificada = fraseCodificada.concat(String.valueOf(letra));

        }
        return fraseCodificada;
    }
}
