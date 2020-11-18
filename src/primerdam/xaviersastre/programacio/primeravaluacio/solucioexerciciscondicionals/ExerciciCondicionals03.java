package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals03
 *
 *    Description:  Escriu un programa que donat un nombre del 1 al 7 escrigui el
 *                  corresponent nom del dia de la setmana.
 *
 *        Created:  06 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals03 {
    public static void main(String[] args) {

        String dia;

        System.out.print("Per favor, introduir un nombre de 1 a 7: ");
        int n = Integer.parseInt(System.console().readLine());

        switch(n) {
            case 1:
                dia = "dilluns";
                break;
            case 2:
                dia = "dimarts";
                break;
            case 3:
                dia = "dimecres";
                break;
            case 4:
                dia = "dijous";
                break;
            case 5:
                dia = "divendres";
                break;
            case 6:
                dia = "dissabte";
                break;
            case 7:
                dia = "diumenge";
                break;
            default:
                dia = "Ha d'introduir un nombre de 1 a 7";
        }

        System.out.println(dia);

    }
}
