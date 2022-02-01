/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    public void crearRectangulo(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base del rectángulo ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectángulo ");
        altura = entrada.nextDouble();
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    
    public double obtencionSuperficie(){
        double superficie = base * altura;
        return superficie;
    }
    
    public double obtencionPerimetro(){
        double perimetro = (base + altura) * 2 ;
        return perimetro;
    }
    
    public void dibujoRectangulo () {
        
        for (int i=0; i<altura; i++){
            for (int j=0; j<base; j++) {
                if (i==0 || i==altura-1 || j==0 || j==base-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
