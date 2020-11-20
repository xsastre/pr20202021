package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Fes un programa que digui si un nombre enter positiu introduït per
 *              teclat és capicua. Es permeten nombre de fins a 5 xifres.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals18 {

    public static void main(String[] args) {

        int n;
        boolean capicua = false;

        System.out.print("Per favor, introduiu un nombre enter (de 5 xifres com a màxim): ");
        n = Integer.parseInt(System.console().readLine());


        // nombre d'una xifra
        if (n < 10) {
            capicua = true;
        }

        // nombre de dues xifres
        if ((n >= 10) && (n < 100)) {
            if ((n / 10) == (n % 10)) {
                capicua = true;
            }
        }

        // nombre de tres xifres
        if ((n >= 100) && (n < 1000)) {
            if ((n / 100) == (n % 10)) {
                capicua = true;
            }
        }

        // nombre de quatre xifres
        if ((n >= 1000) && (n < 10000)) {
            if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
                capicua = true;
            }
        }

        // nombre de cinc xifres
        if (n >= 10000) {
            if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
                capicua = true;
            }
        }

        if (capicua) {
            System.out.println("El nombre introduit és capicua.");
        } else {
            System.out.println("El nombre introduit no és capicua.");
        }
    }
}