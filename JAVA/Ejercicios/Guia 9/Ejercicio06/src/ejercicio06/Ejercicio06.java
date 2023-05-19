/*

 */
package ejercicio06;

import entidades.Curso;
import java.util.Scanner;
import servicios.CursoService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CursoService cs = new CursoService();
        Curso c1 = cs.crearCurso();
        int op;
        do {

            System.out.println("MENU\n"
                    + "1-Calcular Ganancias\n"
                    + "2-Salir\n");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println(cs.calcularGananciaSemana(c1));
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
            }
        } while (op!=2);
    }

}
