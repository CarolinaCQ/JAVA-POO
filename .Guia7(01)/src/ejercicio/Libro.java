/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package ejercicio;

import java.util.Locale;
import java.util.Scanner;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {

    }

    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void cargarLibro() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el ISBN");
        isbn = entrada.nextInt();
        System.out.println("Ingrese el titulo");
        titulo = entrada.next();
        System.out.println("Ingrese el autor");
        autor = entrada.next();
        System.out.println("Ingrese número de página");
        numeroPaginas = entrada.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("Los datos del libro son: El ISBN es " + isbn + " ,el tiutlo es " + titulo + " , el autor es " + autor + " y el numero de páginas es " + numeroPaginas);

    }
}
