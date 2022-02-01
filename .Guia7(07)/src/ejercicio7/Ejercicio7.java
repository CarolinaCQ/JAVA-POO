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

public class Ejercicio7 {
    

    public static void main(String[] args) {
        
        
        Persona persona1 = new Persona("carolina", 23, "M", 50, 1.60);
        Persona persona2 = new Persona("juan", 34, "H", 45, 1.50);
        Persona persona3 = new Persona("rodri", 29, "H", 70, 1.65);
        Persona persona4 = new Persona("hola", 12, "O", 30, 1.40);

//        persona1.crearPersona();
//        persona2.crearPersona();
//        persona3.crearPersona();
//        persona4.crearPersona();
        
        //promedio IMC
        
        double [] calcularImc = new double [4];
        calcularImc[0] = persona1.calcularIMC();
        calcularImc[1] = persona2.calcularIMC();
        calcularImc[2] = persona3.calcularIMC();
        calcularImc[3] = persona4.calcularIMC();
        
        double bajoPeso = 0;
        double idealPeso = 0;
        double sobrePeso = 0;
        for (int i=0; i<4; i++){
            if (calcularImc[i]==-1){
                bajoPeso ++;
                
            } else if (calcularImc[i]==0) {
                idealPeso ++;
                
            } else if (calcularImc[i]==1) {
                sobrePeso ++;
                
            }
        }
        
      
        double promedioBajoPeso = (bajoPeso/4)*100;
        double promedioIdealPeso = (idealPeso/4)*100;
        double promedioSobrePeso = (sobrePeso/4)*100;
        
        System.out.println("El promedio de personas con bajo peso es " + promedioBajoPeso + 
                "%, de personas con peso ideal es " + promedioIdealPeso +
                "% y de personas con sobre peso " + promedioSobrePeso + "%");
        
        //promedio edad
        
        boolean [] mayorEdad = new boolean [4];
        mayorEdad[0] = persona1.mayorEdad();
        mayorEdad[1] = persona2.mayorEdad();
        mayorEdad[2] = persona3.mayorEdad();
        mayorEdad[3] = persona4.mayorEdad();
        promedioEdad(mayorEdad);

        

    }


    
    static void promedioEdad (boolean [] mayorEdad){
        double esMayor = 0;
        double esMenor = 0;
        for (int i=0; i<4; i++){
            if(mayorEdad[i]==true){
                esMayor ++;
            } else {
                esMenor ++;
            }
            
        }
        
        double promedioMayor = (esMayor/4)*100;
        double promedioMenor = (esMenor/4)*100;
            
        System.out.println("El promedio de personas mayores de edad es " + promedioMayor + 
                "% y de las personas menores de edad " + promedioMenor + "%.");
    }

}
