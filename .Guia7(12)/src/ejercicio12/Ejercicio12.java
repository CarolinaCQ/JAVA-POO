/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Persona persona = new Persona();
        
        persona.crearPersona();
        persona.calcularEdad();
        
        System.out.println("Ingrese una edad para comparar ");
        int edadComparar = entrada.nextInt();
        if (persona.menorQue(edadComparar)){
            System.out.printf("Es mayor que %s. \n", persona.getNombre());
        } else {
            System.out.printf("Es menor que %s. \n", persona.getNombre());
        }
        
        persona.mostrarPersona();
    }
    
}
