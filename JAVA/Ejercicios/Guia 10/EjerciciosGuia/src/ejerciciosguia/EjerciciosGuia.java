/*

 */
package ejerciciosguia;

import entidades.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Mariano Sotelo
 */
public class EjerciciosGuia {

    public static void main(String[] args) {
        /**
         * DETECCION DE ERRORES
         */
//        ArrayList<Integer> listado = new ArrayList();
//        TreeSet<String> nombres = new TreeSet();
//        HashMap<Integer, String> personas = new HashMap();

        /**
         * EJERCICIO CREAR COLECCIONES
         */
        ArrayList<Integer> numerosA = new ArrayList();
        numerosA.add(50);
        numerosA.add(30);
        numerosA.add(20);
        numerosA.add(40);
        numerosA.add(10);
        System.out.println(numerosA);

        HashSet<Integer> numerosB = new HashSet();
        numerosB.add(50);
        numerosB.add(40);
        numerosB.add(30);
        numerosB.add(20);
        numerosB.add(10);
        System.out.println(numerosB);

        HashMap<Integer, String> alumnos = new HashMap();
        alumnos.put(3, "Mariano");
        alumnos.put(5, "Paula");
        alumnos.put(1, "Martin");
        alumnos.put(4, "Cristian");
        alumnos.put(2, "Noelia");

        System.out.println(alumnos);

        System.out.println(""); //Salto de linea para separar

        /**
         * EJERCICIO ELIMINAR ELEMENTOS/INDICES/LLAVES
         */
        numerosA.remove(2);
        System.out.println("indice 2 borrado = " + numerosA);

        numerosB.remove(30);
        System.out.println("elemento 30 borrado = " + numerosB);

        alumnos.remove(4);
        System.out.println("llave 4 borrada = " + alumnos);

        System.out.println(""); //Salto de linea para separar

        /**
         * MOSTRANDO COLECCIONES
         */
        for (Integer aux : numerosA) {
            System.out.print(aux + " ");
        }
        System.out.println("");

        for (Integer aux : numerosB) {
            System.out.print(aux + " ");
        }
        System.out.println("");

        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("Numero = " + entry.getKey() + ", Nombre = " + entry.getValue());
        }

        System.out.println(""); //Salto de linea para separar

        /**
         * DETECCIONS DE ERRORES 2
         */
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(1, n1);
        personas.put(2, n2);

        /**
         * RECORRER CON ITERATOR
         */
        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");

        Iterator iterator = lista.iterator();
        System.out.println("Elementos de la lista:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
        System.out.println("");

        /**
         * ELIMINAR CON ITERAROR
         */
        ArrayList<String> palabras = new ArrayList();
        palabras.add("Hola");
        palabras.add("Mundo");
        System.out.println("Lista completo = " + palabras);

        Iterator it = palabras.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Hola")) {
                it.remove();
            }
        }
        System.out.println("Eliminamos 'hola' = " + palabras);

        HashSet<Integer> numerosSet = new HashSet();
        numerosSet.add(1);
        numerosSet.add(3);
        numerosSet.add(2);
        System.out.println("Conjunto completo" + numerosSet);
        Iterator it2 = numerosSet.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(3)) {
                it2.remove();
            }
        }
        System.out.println("Eliminamos el num 3 = " + numerosSet);

        /**
         * DETECCION DE ERRORES 3
         */
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it3 = bebidas.iterator();
        while (it3.hasNext()) {
            if (it3.next().equals("café")) {
                it3.remove();
            }

        }
        System.out.println(""); //Salto de linea para separar
        
        /**
         * EJERCICIO LISTA DE OBJETOS
         */
        
        ArrayList<Libro> libreria = new ArrayList();
        Libro libro1 = new Libro("Titulo 1");
        Libro libro2 = new Libro("Titulo 2");
        Libro libro3 = new Libro("Titulo 3");
        libreria.add(libro1);
        libreria.add(libro2);
        libreria.add(libro3);
        
        for (Libro aux : libreria) {
            System.out.println(aux);
        }
        System.out.println(""); //Salto de linea para separar

    }
}