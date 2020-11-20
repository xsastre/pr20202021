package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

import java.util.Scanner;

/**
 * Description: Escriu un programa que demani dos nombres (sencers positius) que seran
 *              la base i l’exponent per a calcular la seva potència. Si detecta que
 *              qualsevol entrada no és un nombre correcte, donarà un missatge i s’aturarà.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduiu la base: ");
        int base = Integer.parseInt(sc.nextLine());

        System.out.print("Introduiu l'exponent: ");
        int exponent = Integer.parseInt(sc.nextLine());

        double potencia = 1;

        if (exponent == 0) {
            potencia = 1;
        }

        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                potencia *= base;
            }
        }

        if (exponent < 0) {
            for (int i = 0; i < -exponent; i++) {
                potencia *= base;
            }

            potencia = 1/potencia;
        }

        System.out.println(base + "^" + exponent + " = " + potencia);
    }
}
