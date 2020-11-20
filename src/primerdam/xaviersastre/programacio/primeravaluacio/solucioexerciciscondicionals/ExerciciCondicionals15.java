package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Escriu un programa que digui quina és la darrera xifra d’un nombre enter
 *              introduït per teclat.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals15 {

    public static void main(String[] args) {

        System.out.print("Por favor, introduiu un nombre enter: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("Da darrera xifra del nombre introduit és " + (n % 10));
    }
}
