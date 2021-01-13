package primerdam.xaviersastre.programacio.segonaavaluacio.arrayList; /**
 * Ordenación de un ArrayList
 * 
 *
 */

import java.util.Collections;
import java.util.ArrayList;

public class ExempleArrayList071 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();

    a.add(67);
    a.add(78);
    a.add(10);
    a.add(4);

    System.out.println("\nNúmeros en el orden original:");
    for (int numero: a) {
      System.out.println(numero);
    }

    Collections.sort(a);

    System.out.println("\nNúmeros ordenados:");
    for (int numero: a) {
      System.out.println(numero);
    }
  }
}
