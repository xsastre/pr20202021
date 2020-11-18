package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description: Fes un programa que demana un nombre de 0 a 9 i que a continuació mostri
 *              la taula de multiplicació corresponent al nombre inserit. Si l’usuari
 *              introdueix un nombre diferent a 0-9, tornarà a demanar el nombre fins que
 *              s’introdueixi un nombre correcte.
 * <p>
 * Created:  15 nov. 2020
 * <p>
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles08 {

    public static void main(String[] args) {

        System.out.print("Introduiu un nombre enter i mostrarem la seva taula de " +
                "multiplicar: ");
        int nombreIntroduit = Integer.parseInt(System.console().readLine());

        for (int i = 0; i <= 10; i++) {
            System.out.println(nombreIntroduit + " x " + i + " = " + nombreIntroduit * i);
        }

    }
}
