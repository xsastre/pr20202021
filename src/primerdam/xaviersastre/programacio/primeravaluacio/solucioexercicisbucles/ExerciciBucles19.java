package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

import java.util.Scanner;

/**
 * Description: Fes un programa que pinti una piràmide per pantalla on l’alçada
 *              s’introduirà per teclat. També haurà de demanar per teclat amb quin
 *              caràcter volem pintar la piràmide.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles19 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Alçada de la piràmeide: ");
        int alsada = Integer.parseInt(sc.nextLine());

        System.out.print("Caràcter per fer la piràmide: ");
        String farcit = sc.nextLine();

        int planta = 1;
        int longitudDeLinia = 1;
        int espais = alsada-1;

        while (planta <= alsada) {

            // insereix espais
            for (int i = 1; i <= espais; i++) {
                System.out.print(" ");
            }

            // pinta la linia
            for (int i = 1; i <= longitudDeLinia; i++) {
                System.out.print(farcit);
            }

            System.out.println();

            planta++;
            espais--;
            longitudDeLinia += 2;
        }
    }
}
