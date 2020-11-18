package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description: Fes un programa que ens digui quants de dígits té un nombre introduït
 *              per teclat.
 * <p>
 * Created:  15 nov. 2020
 * <p>
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles09 {

    public static void main(String[] args) {

        int nombreDeDigits = 1, n, nombreIntroduit;

        System.out.print("Introduiu un nombre enter i vos diré quants de dígits té: ");
        nombreIntroduit = Integer.parseInt(System.console().readLine());

        n = nombreIntroduit;

        while (n > 10) {
            n /= 10;
            nombreDeDigits++;
        }

        System.out.println(nombreIntroduit + " té " + nombreDeDigits + " dígit/s.");

    }
}
