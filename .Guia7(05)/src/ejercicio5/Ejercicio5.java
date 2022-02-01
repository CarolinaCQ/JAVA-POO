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

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Cuenta cuenta = new Cuenta();

        cuenta.crearCuenta();
        cuenta.ingresarDinero(1000);
        cuenta.retirarDinero(800);
        cuenta.extraccionRapida();
        int opcion;

        do {
            
            System.out.println("Qué desea consultar? ");
            System.out.println("1) Saldo Actual");
            System.out.println("2) Datos de la cuenta bancaria");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo(cuenta.getSaldoActual());
                    break;
                case 2:
                    cuenta.consultarDatos(cuenta.getNumeroCuenta(), cuenta.getDni(), cuenta.getSaldoActual());
                    break;
                default:
                    System.out.println("ERROR! No es una opción válida, ingrese una opción correcta");
                    break;
            }
        } while (opcion != 1 && opcion != 2);

    }

}
