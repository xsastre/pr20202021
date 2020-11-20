package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Escriu un programa que ens digui quants de dígits té un nombre enter
 *              que pot ser negatiu o positiu. Es permeten nombres de fins a 5 dígits.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals17 {

    public static void main(String[] args) {

        int n, digits = 0;

        System.out.print("Per favor, introduiu un nombre enter (de 5 xifres com a màxim): ");
        n = Math.abs(Integer.parseInt(System.console().readLine()));

        if ( n < 10 ) {
            digits = 1;
        }

        if (( n >= 10 ) && ( n < 100 )) {
            digits = 2;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
            digits = 3;
        }

        if (( n >= 1000 ) && ( n < 10000 )) {
            digits = 4;
        }

        if ( n >= 10000 ) {
            digits = 5;
        }

        System.out.println("El nombre introduit té " + digits + " dígits.");
    }
}
