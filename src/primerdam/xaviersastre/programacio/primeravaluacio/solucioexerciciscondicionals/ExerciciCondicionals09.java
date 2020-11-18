package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals09
 *
 *    Description:  Fes un programa que resolgui una eqüació de segon grau (tipus ax2+bx+c=0.)
 *
 *        Created:  13 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals09 {

    public static void main(String[] args) {

        double x1, x2;

        System.out.println("Aquest programa resol eqüacions de segon grau tipus.");
        System.out.println("ax^2 + bx + c = 0");

        System.out.println("Por favor, introduiu els valors.");

        System.out.print("a = ");
        double a = Double.parseDouble(System.console().readLine());

        System.out.print("b = ");
        double b = Double.parseDouble(System.console().readLine());

        System.out.print("c = ");
        double c = Double.parseDouble(System.console().readLine());


        // 0x^2 + 0x + 0 = 0

        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("L'eqüació té infinites soluciones.");
        }

        // 0x^2 + 0x + c = 0  amb c distint de 0

        if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("L'eqüació no té solució.");
        }

        // ax^2 + bx + 0 = 0  amb a i b distints de 0

        if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }


        // 0x^2 + bx + c = 0  amb b i c distints de 0

        if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println("x1 = x2 = " + (-c / b));
        }

        // ax^2 + bx + c = 0  amb a, b i c distints de 0

        if ((a != 0) && (b != 0) && (c != 0)) {

            double discriminant = b*b - (4 * a * c);

            if (discriminant < 0) {
                System.out.println("L'eqüació no té solucions reals");
            }	else {
                System.out.println("x1 = " + (-b + Math.sqrt(discriminant))/(2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(discriminant))/(2 * a));
            }
        }

    }
}
