package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals08
 *
 *    Description:  Sobre l’exercici 7, fes que a més a més ens digui la nota en
 *                  caràcters (insuficient, suficient, bé, notable o excel·lent)
 *
 *        Created:  13 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals08 {

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

        if (mitjana < 5) {
            System.out.print("Insuficient");
        }

        if ((mitjana >= 5) && (mitjana < 6)) {
            System.out.print("Suficient");
        }

        if ((mitjana >= 6) && (mitjana < 7)) {
            System.out.print("Bé");
        }

        if ((mitjana >= 7) && (mitjana < 9)) {
            System.out.print("Notable");
        }

        if (mitjana >= 9) {
            System.out.print("Excel·lent");
        }
    }
}
