package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals04
 *
 *    Description:  Escriu un programa que calculi el sou setmanal d’un treballador
 *                  tenint en compte que les hores ordinàries (40 primeres hores de treball)
 *                  es paguen a 12€/hora. A partir de l’hora 41, es paguen a 16€/hora.
 *
 *        Created:  06 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals04 {
    public static void main(String[] args) {

        int souSetmanal;

        System.out.print("Per favor, introduir el nombre d'hores treballades durant la setmana: ");
        int horesTreballades = Integer.parseInt(System.console().readLine());

        if (horesTreballades < 40) {
            souSetmanal = 12 * horesTreballades;
        } else {
            souSetmanal = (40 * 12) + ((horesTreballades - 40) * 16);
        }
        System.out.println("El sou setmanal que li correspon és de " + souSetmanal + " euros");
    }
}
