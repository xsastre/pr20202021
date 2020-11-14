package primerdam.xaviersastre.programacio.primeravaluacio.exemplesclasseobjectes;

/*
 *       Filename:  PersonaTest
 *
 *    Description:  Exemple per comprovar la classe Persona
 *
 *        Created:  14 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PersonaTest {

    /**
     * Main method.
     *
     * @param args No utilitzat
     *             Not used
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("", 0, 0, 'W', false);
        Persona p2 = new Persona("", 0, 0, 'W', false);
        mostraPersona(p1);
        mostraPersona(p2);

        p1.aniversari();
        mostraPersona(p1);

        p2.aniversari();
        mostraPersona(p2);

        Persona nina = p1;
        Persona nin = p2;

        nina.aniversari();
        mostraPersona(p1);

        nin.aniversari();
        mostraPersona(p2);

    }

    /**
     * Mostra una representació textual de la persona
     * Prints a textual representation of a person.
     *
     * @param p una persona // a person
     */
    public static void mostraPersona(Persona p) {
        System.out.println("Nom:    " + p.getNom());
        System.out.println("Edat:   " + p.getEdat());
        System.out.println("Alçada: " + p.getAlsada());
        System.out.println("Sexe:   " + p.getSexe());
        System.out.println("Casat:  " + p.estaCasada());
        System.out.println();
    }

}
