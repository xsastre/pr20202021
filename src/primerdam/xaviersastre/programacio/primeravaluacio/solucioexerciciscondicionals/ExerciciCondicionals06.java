package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals06
 *
 *    Description:  Realitza un programa que calcule el temps que tardarà
 *                  un objecte en caure des d’una alçada h.
 *
 *        Created:  13 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals06 {

    // les constants es declaren fora del main
    final static double g = 9.81;

    public static void main(String[] args) {

        System.out.println("Càlcul del temps de caiguda d'un objecte.");
        System.out.print("Per favor, introduiu l'alçada (en metres) des de la que cau l'objecte: ");
        Double h = Double.parseDouble(System.console().readLine());

        double s = Math.sqrt(2*h/g);

        System.out.printf("L'objecte tarda %.2f segons en caure.\n", s);
    }
}
