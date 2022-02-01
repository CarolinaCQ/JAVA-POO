/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9;

/**
 *
 * @author carol
 */
public class Matematica {
    private double num1;
    private double num2;
    
    public Matematica(){
        
    }
    
    public Matematica(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void devolverMayor(){
        System.out.printf("El mayor de los números es %.2f. \n",Math.max(num1, num2));
    }
    
    public void calcularPotencia(){
        double num1Redondeado = Math.round(num1);
        double num2Redondeado = Math.round(num2);
        
        System.out.printf("La potencia del mayor valor elevado al menor número es %f. \n", Math.pow(Math.max(num1Redondeado, num2Redondeado), Math.min(num1Redondeado, num2Redondeado)));
    }
    
    public void calculaRaiz(){
        double valorAbsolutoMenorNum = Math.abs(Math.min(num1,num2));
        System.out.printf("La raíz cuadrada del valor absoluto del menor de los dos valores es %.2f. \n",Math.sqrt(valorAbsolutoMenorNum));
    }
    
    
}
