/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Persona {
    
    Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    
    public Persona() {
        
    }
    
    public Persona (String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    
// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
    public void crearPersona () {
        System.out.println("Ingrese los siguientes datos: ");
        System.out.print("Nombre : ");
        nombre = entrada.next();
        System.out.println("");
        System.out.print("Edad : ");
        edad = entrada.nextInt();
        System.out.println("");
        System.out.print("Sexo : ");
        sexo = entrada.next();
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.print("ERROR! Letra incorrecta, ingrese la letra correcta");
            sexo = entrada.next();
            System.out.println("");
            
            }
        System.out.println("");
        System.out.print("Peso : ");
        peso = entrada.nextDouble();
        System.out.println("");
        System.out.print("Altura : ");
        altura = entrada.nextDouble();
        System.out.println("");
        
    }
    
    
//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public double calcularIMC(){
        double imc = peso / Math.pow(altura, 2);
        int retornoImc;
        if (imc<20) {
            retornoImc = -1;
        } else if (imc>=20 && imc<=25){
            retornoImc = 0;
        } else {
            retornoImc = 1;
        }
        return retornoImc;
        
    }
    
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    public boolean mayorEdad (){
        boolean mayorEdad;
        mayorEdad = edad>=18;
        return mayorEdad;
    }

    double calcularIMC(String carolina, int i, String m, int i0, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
