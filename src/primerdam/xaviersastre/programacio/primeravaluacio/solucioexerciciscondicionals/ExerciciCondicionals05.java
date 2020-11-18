package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals05
 *
 *    Description:  Escriu un programa que resolgui una eqüació de primer grau (tipus ax+b=0)
 *
 *        Created:  13 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals05 {
    public static void main(String[] args) {

        System.out.println("Aquest programa resol eqüacions de primer grau del tipus ax + b = 0");
        System.out.print("Per favor, introduiu el valor de a: ");
        Double a = Double.parseDouble(System.console().readLine());
        System.out.print("Ara introduiu el valor de b: ");
        Double b = Double.parseDouble(System.console().readLine());

        if (a == 0) {
            System.out.println("Aquesta eqüació no té solució real.");
        } else {
            System.out.println("x = " + (-b/a));
        }
    }
}
