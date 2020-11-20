package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Escriu un programa que digui quina és la primera xifra d’un nombre enter
 *              introduït per teclat. Es permeten nombres de fins a 5 xifres.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals16 {

    public static void main(String[] args) {

        int n, primera = 0;

        System.out.print("Per favor, introduiu un nombre enter (de 5 xifres com a màxim): ");
        n = Integer.parseInt(System.console().readLine());

        if ( n < 10 ) {
            primera = n;
        }

        if (( n >= 10 ) && ( n < 100 )) {
            primera = n / 10;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
            primera = n / 100;
        }

        if (( n >= 1000 ) && ( n < 10000 )) {
            primera = n / 1000;
        }

        if ( n >= 10000 ) {
            primera = n / 10000;
        }

        System.out.println("La primera xifra del nombre introduit és " + primera);
    }
}
