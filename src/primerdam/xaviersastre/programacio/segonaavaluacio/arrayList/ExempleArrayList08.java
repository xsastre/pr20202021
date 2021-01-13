package primerdam.xaviersastre.programacio.segonaavaluacio.arrayList; /**
 * Ordenación de un ArrayList de objetos
 * 
 *
 */

import java.util.Collections;
import java.util.ArrayList;

public class ExempleArrayList08 {
  public static void main(String[] args) {

    ArrayList<Gato> g = new ArrayList<Gato>();

    g.add(new Gato("Garfield", "naranja", "mestizo"));
    g.add(new Gato("Pepe", "gris", "angora"));
    g.add(new Gato("Mauri", "blanco", "manx"));
    g.add(new Gato("Ulises", "marrón", "persa"));
    g.add(new Gato("Adán", "negro", "angora"));

    Collections.sort(g);

    System.out.println("\nDatos de los gatos ordenados por nombre:");

    for (Gato gatoAux: g) {
      System.out.println(gatoAux+"\n");
    }
    Gato tofol=new Gato("Biel","Blau","laquesigui");
    System.out.println(g.get(2).compareTo(tofol));
  }
}
