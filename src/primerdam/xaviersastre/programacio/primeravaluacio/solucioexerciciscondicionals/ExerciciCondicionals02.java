package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals02
 *
 *    Description:  Escriviu un programa que mostri “Bon dia”, “Bona tarda”, “Bon vespre”
 *                  o “Bona nit” segons la hora que s’introdueixi per teclat.
 *                  De 6 a 12, bon dia; de 13 a 19, bona tarda; de 20 a 22, bon vespre
 *                  i de 23 a 5, bona nit. Basta s’introdueixin les hores.
 *                  No es necessari considerar els minuts.
 *
 *        Created:  06 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals02 {
        public static void main(String[] args) {

            System.out.print("Per favor, introduir una hora del dia (0 - 23): ");
            int hora = Integer.parseInt(System.console().readLine());

            if ((hora >= 6) && (hora <= 12)) {
                System.out.println("Bon dia");
            }

            if ((hora >= 13) && (hora <= 19)) {
                System.out.println("Bona tarda");
            }

            if ((hora >= 20) && (hora <= 22)) {
                System.out.println("Bon vespre");
            }

            if (((hora >= 23) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
                System.out.println("Bona nit");
            }

            if ((hora >= 24) || (hora < 0)) {
                System.out.println("L'hora introduida no és correcta.");
            }
        }
    }
