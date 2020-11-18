package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals07
 *
 *    Description:  Fes un programa que calculi la mitjana aritmètica de tres notes.
 *
 *        Created:  13 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals07 {

    public static void main(String[] args) {

        System.out.println("Aquest programa calcula la mitjana de tres notes.");

        System.out.print("Per favor, introduiu la primera nota: ");
        Double nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("Ara introduiu la segona nota: ");
        Double nota2 = Double.parseDouble(System.console().readLine());

        System.out.print("Finalment introduiu la tercera nota: ");
        Double nota3 = Double.parseDouble(System.console().readLine());

        double mitjana = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La mitjana és %.2f\n", mitjana);
    }
}
