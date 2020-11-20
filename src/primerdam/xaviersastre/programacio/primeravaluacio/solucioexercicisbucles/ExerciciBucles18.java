package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

import java.util.Scanner;

/**
 * Description: Fes un programa que obtingui i mostri els nombres sencers entre dos
 *              nombres introduïts per teclat que el programa validi que siguin diferents,
 *              de manera que hauria de començar des del més petit amb increments de 7
 *              en 7 fins arribar al més gran.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles18 {

    public static void main(String[] args) {

        int primerNombre;
        int segonNombre;
        Scanner sc = new Scanner(System.in);

        // demana dos nombres i verifica que siguin distints
        do {
            System.out.print("Introduiu un nombre enter: ");
            primerNombre = Integer.parseInt(sc.nextLine());
            System.out.print("Introduiu un altre nombre enter diferent a l'anterior: ");
            segonNombre = Integer.parseInt(sc.nextLine());

            if(primerNombre == segonNombre) {
                System.out.println("Els nombre han de ser diferents.");
            }
        } while (primerNombre == segonNombre);

        // si el primer nombre és major que el segon, canviam l'ordre
        if (primerNombre > segonNombre) {
            int aux = primerNombre;
            primerNombre = segonNombre;
            segonNombre = aux;
        }

        for(int i = primerNombre; i <= segonNombre; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
