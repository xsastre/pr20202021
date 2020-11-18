package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals01
 *
 *    Description:  Escriu un programa que demani per teclat un dia de la setmana (caràcters)
 *                  i digui quina assignatura toca a primera hora d’aquell dia.
 *
 *        Created:  06 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals01 {
    public static void main(String[] args) {
        String dia;

        System.out.print("Per favor, introduir un dia de la setmana i us diré quina assignatura toca a primera hora: ");
        dia = (System.console().readLine());
        dia.toLowerCase(); // converteix a minúscules totes les lletres

        switch (dia) {
            case "dilluns":
                // continua cap abaix
            case "dimarts":
                // continua cap abaix
            case "dimecres":
                System.out.println("Programació");
                break;
            case "dijous":
                System.out.println("Sistemes Informàtics");
                break;
            case "divendres":
                System.out.println("Bases de dades");
                break;
            case "dissabte":
                System.out.println("Aquest dia no hi ha classes!");
                break;
            case "diumenge":
                System.out.println("Aquest dia no hi ha classes!");
                break;
            default:
                System.out.println("El dia introduit no és correcte.");
        }
    }
}
