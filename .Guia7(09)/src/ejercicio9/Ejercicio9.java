/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Matematica operaciones = new Matematica();
        
        operaciones.setNum1(Math.random()*11);
        operaciones.setNum2(Math.random()*11);
        System.out.printf("El valor del número 1 es %.2f y del número 2 es %.2f. \n", operaciones.getNum1(), operaciones.getNum2());
        
        operaciones.devolverMayor();
        operaciones.calcularPotencia();
        operaciones.calculaRaiz();
        
    }
    
}
