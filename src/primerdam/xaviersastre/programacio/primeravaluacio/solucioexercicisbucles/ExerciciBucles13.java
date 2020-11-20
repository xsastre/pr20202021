package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

import java.util.Scanner;

/**
 * Description: Escriu un programa que llegeixi per paràmetres una llista de 10 nombres
 *              i calculi quants de nombres són positius i quants són negatius. Si
 *              detecta que qualsevol entrada no és un nombre sencer positiu o negatiu,
 *              donarà un missatge i s’aturarà.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles13 {

    public static void main(String[] args) {

        System.out.println("Per favor, introduiu 10 nombres enters: ");

        int negatius = 0;
        int positius = 0;
        int zeros =0;
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int valorIntroduit = Integer.parseInt(System.console().readLine());
            if (valorIntroduit < 0 )
            negatius++;
            else if (valorIntroduit > 0)
                positius++;
            else
                zeros++;
        }
        System.out.println("Heu introduit " + positius + " positius, " + negatius + " negatius i " +
                zeros + " zeros.");

    }
}
