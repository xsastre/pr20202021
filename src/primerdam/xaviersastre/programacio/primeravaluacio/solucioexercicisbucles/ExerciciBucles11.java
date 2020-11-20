package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description: Escriu un programa que mostri en tres columnes diferents, el quadrat
 *              i el cub dels 5 primers nombres sencers que l’usuari hagi introduït
 *              per teclat.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles11 {

    public static void main(String[] args) {

        System.out.print("Introduiu un nombre: ");
        int nombreIntroduit = Integer.parseInt(System.console().readLine());

        for (int i = nombreIntroduit; i < nombreIntroduit + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}
