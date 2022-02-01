/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    
    
    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    
    public Cuenta(){
        
    }
    
    public Cuenta(int numeroCuenta, long dni, double saldoActual){
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    
    public void crearCuenta (){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("a) Número de cuenta");
        numeroCuenta = entrada.nextInt();
        System.out.println("b) DNI");
        dni = entrada.nextLong();
        System.out.println("c) Saldo Actual");
        saldoActual = entrada.nextDouble();
    }
    
    public void ingresarDinero(double ingreso) {
        saldoActual += ingreso;
    }
    
    public void retirarDinero(double retiro) {
        if (saldoActual<retiro){
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }
        
    }
    
    public void extraccionRapida(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el monto que desea retirar: ");
        double extraccionRapida = entrada.nextDouble();
        if (extraccionRapida <= (0.20*saldoActual)){
            saldoActual -= extraccionRapida;
        } else {
            System.out.println("No se permite realizar extracción rápida mayor al 20%");
        }
    }
    
    public void consultarSaldo (double saldoActual){
        System.out.println("El saldo actual es " + saldoActual);
    }
    
    public void consultarDatos (int numeroCuenta, long dni, double saldoActual) {
        System.out.println("Los datos de la cuenta son: ");
        System.out.println("Número de cuenta "+ numeroCuenta);
        System.out.println("DNI " + dni);
        System.out.println("Saldo Actual  " + saldoActual);
    }
}
