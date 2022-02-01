/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package ejercicio11;

import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author carol
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        System.out.println("Ingrese un dia");
        int dia = entrada.nextInt();
        System.out.println("Ingrese un mes");
        int mes = entrada.nextInt();
        mes -= 1;
        System.out.println("Ingrese un año");
        int anio = entrada.nextInt();
        anio -= 1900;
        
        Date fecha = new Date(anio,mes,dia);
        System.out.println(fecha);
        
        Date fechaActual = new Date();
        
        System.out.printf("Hay %d años entre %d y %d. \n", (fechaActual.getYear()-fecha.getYear()), fecha.getYear()+1900, fechaActual.getYear()+1900);
        
    }

    
}
