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
package ejercicio;

import java.util.Locale;
import java.util.Scanner;

public class MainEjercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Cafetera cafetera = new Cafetera(1000, 800);
        int opcion;

        do {
            System.out.println("Elija la opcion que desea: ");
            System.out.println("1) Llenar la cafetera");
            System.out.println("2) Servir taza");
            System.out.println("3) Vaciar la cafetera");
            System.out.println("4) Agregar cafe");
            System.out.println("5) Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    int tamañoTaza = entrada.nextInt();
                    cafetera.servirTaza(tamañoTaza);
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe a agregar");
                    int cantidadCafe = entrada.nextInt();
                    cafetera.agregarCafe(cantidadCafe);
                    break;
                case 5:
                    System.out.println("Ha salido");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion!=5);
        
        
        
    
    }

}
