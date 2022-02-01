/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase: ");
        cadena.setFrase(entrada.next());
        cadena.setLongitud(cadena.getFrase().length());

        int opcion;

        do {
            System.out.println("Escoja la acción que desea realizar: ");
            System.out.println("1) Mostrar cuántas vocales contiene la frase");
            System.out.println("2) Mostrar la frase invertida");
            System.out.println("3) Ingresar un caracter a ser buscado en la frase");
            System.out.println("4) Ingresar una frase nueva para comparar la longitud");
            System.out.println("5) Ingresar una frase nueva para unir a la frase inicial");
            System.out.println("6) Ingresar una letra que reemplace a la letra A en la frase");
            System.out.println("7) Ingresar un letra para saber si se encuentra en la frase");
            System.out.println("8) Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    cadena.mostrarVocales();
                    break;
                case 2:
                    cadena.invertirFrase();
                    break;
                case 3:
                    System.out.println("Ingrese un caracter a ser buscado en la frase: ");
                    String letraBuscar = entrada.next();
                    cadena.vecesRepetido(letraBuscar);
                    break;
                case 4:
                    System.out.println("Ingrese una nueva frase para comparar: ");
                    String fraseParaComparar = entrada.next();
                    cadena.compararLongitud(fraseParaComparar);
                    break;
                case 5:
                    System.out.println("Ingrese una nueva frase para unir a la cadena: ");
                    String fraseParaUnir = entrada.next();
                    cadena.unirFrases(fraseParaUnir);
                    break;
                case 6:
                    System.out.println("Ingrese una letra para reemplazar las letras A de la frase: ");
                    String letraReemplazar = entrada.next();
                    cadena.reemplazarLetraA(letraReemplazar);
                    break;
                case 7:
                    System.out.println("Ingrese una letra para saber si se encuentra en la frase: ");
                    String letraVerdaderoContiene = entrada.next();
                    if (cadena.contieneLetra(letraVerdaderoContiene)) {
                        System.out.printf("La frase contiene la letra %s. \n", letraVerdaderoContiene);
                    } else {
                        System.out.printf("La frase no contiene la letra %s. \n", letraVerdaderoContiene);
                    }
                    break;
                case 8:
                    System.out.println("Ha salido del programa.");
                    break;
                default:
                    System.out.println("Igrese una opcion válida");
            }

        } while (opcion != 8);

    }

}
