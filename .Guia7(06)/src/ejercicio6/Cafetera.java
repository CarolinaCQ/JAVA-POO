/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {

    Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {

    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void capacidades() {
        System.out.println("Ingrese la capacidad máxima de la cafetera : ");
        capacidadMaxima = entrada.nextInt();
        System.out.println("Ingrese la capacidad actual de la cafetera : ");
        capacidadActual = entrada.nextInt();
        System.out.println("La capacidad máxima es: " + capacidadMaxima);
        System.out.println("La capacidad actual es: " + capacidadActual);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
        System.out.println("La cafetera se ha llenado a su capacidad máxima, se encuentra en " + capacidadActual);
    }

    public void servirTaza(int tamañoTaza) {
        System.out.println("Ingrese el tamaño de la taza : ");
        tamañoTaza = entrada.nextInt();
        if (tamañoTaza > capacidadActual) {
            System.out.println("La taza no se ha llenado, se encuentra en la capacidad " + capacidadActual);
            capacidadActual = 0;
        } else {
            System.out.println("La taza se ha llenado");
            capacidadActual -= tamañoTaza;
        }

    }

    public void vaciarCafetera() {
        capacidadActual = 0;
        System.out.println("La cafetera se ha vaciado.");
    }

    public void agregarCafe(int cantidadCafeAgregar) {
        System.out.println("Ingrese una cantidad de café, para agregar a la cafetera");
        cantidadCafeAgregar = entrada.nextInt();
        capacidadActual += cantidadCafeAgregar;
        System.out.println("La capacidad actual de la cafetera es: " + capacidadActual);
    }
}
