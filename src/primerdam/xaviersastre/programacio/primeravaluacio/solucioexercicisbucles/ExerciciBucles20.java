package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

import java.util.Scanner;

/**
 * Description: Igual que l’exercici anterior, però ara la piràmide serà hueca.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles20 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Alçada de la piràmide: ");
        int alsadaDesitjada = Integer.parseInt(sc.nextLine());

        System.out.print("Caràcter per fer la piràmide: ");
        String farcit = sc.nextLine();

        int alsada = 1;
        int i = 0;
        int espaisPerDavant = alsadaDesitjada - 1;
        int espaisInterns = 0;

        while (alsada < alsadaDesitjada) {

            // insereix espais davant
            for (i = 1; i <= espaisPerDavant; i++) {
                System.out.print(" ");
            }

            // pinta la linia
            System.out.print(farcit);
            for (i = 1; i < espaisInterns; i++) {
                System.out.print(" ");
            }

            if (alsada>1) {
                System.out.print(farcit);
            }

            System.out.println();
            alsada++;
            espaisPerDavant--;
            espaisInterns += 2;
        } // while ////////////////////////////

        // base de la piràmide
        for (i = 1; i < alsada*2; i++) {
            System.out.print(farcit);
        }
    }
}
