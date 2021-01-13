package primerdam.xaviersastre.programacio.segonaavaluacio.arrayList;

/**
 * Definición de la clase Gato
 * 
 * @author
 */
 
public class Gato implements Comparable<Gato> {
  private String nombre;
  private String color;
  private String raza;
  
  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }
  
  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }

  public String toString() {
    return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
  }
  
  public int compareTo(Gato g) {
    return (this.raza).compareTo(g.getRaza());
  }
  
  public boolean equals(Gato g) {
    return (this.raza).equals(g.getRaza());
  }
}
