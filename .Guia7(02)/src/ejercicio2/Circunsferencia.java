/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Circunsferencia {

    private double radio;

    public Circunsferencia() {

    }

    public Circunsferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio de la circunsferencia ");
        radio = entrada.nextDouble();
    }

    public double getRadio() {
        return radio;
    }

    public void area(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es " + area);

    }

    public void perimetro(double radio) {
        int perimetro = (int) (2 * Math.PI * radio);
        System.out.println("El perimetro es " + perimetro);

    }
}
