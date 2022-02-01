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

/**
 *
 * @author carol
 */
public class Cadena {
    private String frase;
    private int longitud;
    
    public Cadena(){
        
    }
    
    public Cadena(String frase, int longitud){
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales(){
        int contador = 0;
        for (int i=0; i<longitud; i++){
            if (frase.substring(i, i+1).equalsIgnoreCase("a") || frase.substring(i, i+1).equalsIgnoreCase("e") || frase.substring(i, i+1).equalsIgnoreCase("i") || frase.substring(i, i+1).equalsIgnoreCase("o") || frase.substring(i, i+1).equalsIgnoreCase("u")) {
                contador ++;
            }
        }
        System.out.printf("La frase tiene %d vocales. \n", contador);
    }
    
    public void invertirFrase(){
        String cadenaInvertida= "";
        for (int i=longitud-1; i>=0; i--){
            cadenaInvertida += frase.substring(i, i+1);
        }
        System.out.printf("La frase invertida es %s. \n", cadenaInvertida);
    }
    
    public void vecesRepetido(String letraBuscar) {
        int contador = 0;
        for (int i=0; i<longitud; i++){
            if(frase.substring(i, i+1).equalsIgnoreCase(letraBuscar)){
                contador ++;
            }
        }
        System.out.printf("El caracter %s se repite %d veces.\n" , letraBuscar, contador);
        
    }
    
    public void compararLongitud (String fraseParaComparar) {
        if(frase.length() == fraseParaComparar.length()){
            System.out.printf("La frase %s tiene la misma longitud que la frase %s.\n", frase, fraseParaComparar);
        } else {
            System.out.printf("La frase %s no tiene la misma longitud que la frase %s.\n", frase, fraseParaComparar);
        }

    }
    
    public void unirFrases(String fraseParaUnir){
        System.out.printf("La nueva frase es %s. \n", frase.concat(fraseParaUnir));
    }
    
    public void reemplazarLetraA(String letraReemplazar){
        System.out.printf("La nueva frase con caracteres reemplazados es %s. \n", frase.replaceAll("a", letraReemplazar));
    }
    
    public boolean contieneLetra(String letraVerdaderoContiene){
        int contador = 0;
        for(int i=0; i<longitud; i++){
            if (frase.substring(i, i+1).equalsIgnoreCase(letraVerdaderoContiene)){
                contador ++;
            }
        }
        return contador>0;
    }
    
}

