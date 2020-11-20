package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Escriu un programa que ordeni tres nombres enters introduits per teclat.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals13 {

    public static void main(String[] args) {

        int aux;

        System.out.println("Aquest programa ordena tres nombre introduits per teclat.");
        System.out.println("Per favor, ves introduint els tres nombres i pulsant INTRO:");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int c = Integer.parseInt(System.console().readLine());

        // ordenació dels dos primers nombres
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        // ordenació dels dos darres nombres
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        // es tornen a ordenar els dos primers
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        System.out.println("Els nombres ordenats de menor a major són:  " + a + ", " + b + " i " + c + ".");
    }
}
