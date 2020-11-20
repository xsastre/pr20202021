package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Escriu un programa que digui si un nombre introduit per teclat és
 *              parell i/o divisible entre 5.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals14 {

    public static void main(String[] args) {

        System.out.print("Per favor, introduiu un nombre enter: ");
        int n = Integer.parseInt(System.console().readLine());

        if ((n % 2) == 0) {
            System.out.print("El nombre introduit és parell");
        } else {
            System.out.print("El nombre introduit és senar");
        }

        if ((n % 5) == 0) {
            System.out.println(" i divisible entre 5.");
        } else {
            System.out.println(" i no és divisible entre 5.");
        }
    }
}
