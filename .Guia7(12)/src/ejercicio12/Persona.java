/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package ejercicio12;


import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Persona {
    private String nombre;
    private Date fechaNacimiento;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, Date fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    public void crearPersona(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese los datos de la persona");
        
        System.out.print("Nombre: ");
        nombre = entrada.next();
        
        System.out.println("Fecha de Nacimiento: ");
        System.out.println("Ingrese dia");
        int dia = entrada.nextInt();
        System.out.println("Ingrese mes");
        int mes = entrada.nextInt();
        System.out.println("Ingrese año");
        int anio = entrada.nextInt();
        
        Date fechaNac = new Date(anio, mes, dia);
        fechaNacimiento = fechaNac;
        
    }
    
    public void calcularEdad(){
        
        Date fechaActual = new Date();
        
        System.out.printf("La persona tiene %d años. \n", fechaActual.getYear()-fechaNacimiento.getYear()+1900);
    }
    
    public boolean menorQue(int edadComparar){
        
        Date fechaActual = new Date();
        
        int edadPersona = fechaActual.getYear()-fechaNacimiento.getYear()+1900;
  
        return edadPersona<edadComparar;
       
    }
    
    public void mostrarPersona(){
        
        Date fechaActual = new Date();
        
        System.out.printf("La persona tiene el nombre de %s y su edad es de %d. \n", nombre, fechaActual.getYear()-fechaNacimiento.getYear()+1900);
    }
}
