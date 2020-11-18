package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description: Fes un programa que calculi la mitjana d’un conjunt de nombres introduïts
 *              per teclat per l’usuari. A priori no sabem quant de nombres hi haurà,
 *              però sabem que l’usuari indicarà que no vol inserir més nombres quan
 *              introdueixi un nombre negatiu.
 * <p>
 * Created:  15 nov. 2020
 * <p>
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles10 {

    public static void main(String[] args) {

        double nombres = 0;
        double nombreIntroduit = 0;
        double suma = 0;

        System.out.println("Aquest programa calcula la mitjana dels nombres enters positius introduits.");
        System.out.println("Introduiu els nombres (podeu aturar introduint un nombre negatiu):");

        while (nombreIntroduit >= 0) {
            nombreIntroduit = Double.parseDouble(System.console().readLine());
            nombres++;
            suma += nombreIntroduit;
        }

        System.out.println("La mitjana dels nombre positius és " + (suma - nombreIntroduit)/ (nombres - 1));

    }
}
