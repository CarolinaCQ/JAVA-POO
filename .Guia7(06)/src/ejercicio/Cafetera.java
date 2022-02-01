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

//import java.util.Locale;
//import java.util.Scanner;



public class Cafetera {
   
    
    private int capacidadMaxima;
    private int capacidadActual;
    
    //constructor vacio
    
    public Cafetera(){
        
    }
    
    //constructor parametrizado
    
    public Cafetera(int capacidadMaxima, int capacidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    //metodos get y set

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }
    
    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
        System.out.println("La cafetera se ha llenado a su capacidad máxima que es " + capacidadActual);
    }
    
//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    
    public void servirTaza(int tamañoTaza) {
//        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
//        System.out.println("Ingrese el tamaño de la taza: ");
//        tamañoTaza = entrada.nextInt();
        
        if (tamañoTaza>capacidadActual){
            System.out.println("La taza no se ha llenado, se encuentra en la cantidad de " + capacidadActual);
        } else {
            System.out.println("Se ha llenado la taza");
        }
        
    }
    
    public void vaciarCafetera(){
        capacidadActual = 0;
        System.out.println("La cafetera se ha vaciado.");
    }
    
//    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    
    public void agregarCafe (int cantidadCafeAgregar){
//        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
//        System.out.println("Ingrese la cantidad de café");
//        cantidadCafeAgregar = entrada.nextInt();
        capacidadActual += cantidadCafeAgregar;
        System.out.println("La cafetera tiene una capacidad actual de " + capacidadActual);
    }
}
