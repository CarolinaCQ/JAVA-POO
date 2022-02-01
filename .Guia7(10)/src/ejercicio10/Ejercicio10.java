/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author carol
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //vector 1
        double[] vector1 = new double[50];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = Math.random() * 11;
            if (i == vector1.length - 1) {
                System.out.printf(" %.2f.", vector1[i]);
            } else {
                System.out.printf(" %.2f,", vector1[i]);
            }

        }
        System.out.println("");

        Arrays.sort(vector1);

        for (int i = 0; i < vector1.length; i++) {
            if (i == vector1.length - 1) {
                System.out.printf(" %.2f.", vector1[i]);
            } else {
                System.out.printf(" %.2f,", vector1[i]);
            }

        }
        System.out.println("");

        //vector 2
        double[] vector2 = new double[20];
        System.arraycopy(vector1, 0, vector2, 0, vector2.length - 10);
        
        for (int i = 11; i < vector2.length; i++) {
            vector2[i] = 0.5;

        }

        for (int i = 0; i < vector2.length; i++) {
            if (i == vector2.length - 1) {
                System.out.printf(" %.2f.", vector2[i]);
            } else {
                System.out.printf(" %.2f,", vector2[i]);
            }

        }
        System.out.println("");

    }

}
