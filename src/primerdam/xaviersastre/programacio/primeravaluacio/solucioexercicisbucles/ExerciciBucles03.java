package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description:  Escriviu un programa que mostre els múltiples de 5 de 0 a 100
 *                  utilitzant un bucle do / while.
 * <p>
 * Created:  15 nov. 2020
 * <p>
 * @Author:  xavier - xavier.sastre@cide.es
 * @Version:  1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles03 {

    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i);
            i+=5;
        } while(i <= 100);
    }
}
