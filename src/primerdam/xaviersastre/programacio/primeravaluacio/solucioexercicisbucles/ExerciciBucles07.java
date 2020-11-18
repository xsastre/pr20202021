package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description: Realitza el control d’accés a una caixa forta. La combinació ha de ser
 *              de 4 xifres. El programa ens demanarà la combinació. Si no encertem,
 *              ens mostrarà el missatge “Ho sentim, combinació incorrecta” i tornarà a
 *              demanar la combinació. Si encertem ens mostrarà “Combinació correcta”
 *              i acabarà. Tindrem 4 oportunitats per encertar la combinació.
 * <p>
 * Created:  15 nov. 2020
 * <p>
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles07 {

    public static void main(String[] args) {

        int intents = 4;
        int nombreIntroduit;
        boolean encertat = false;

        do {
            System.out.print("Introduiu la combinació: ");
            nombreIntroduit = Integer.parseInt(System.console().readLine());

            if (nombreIntroduit == 8888) {
                encertat = true;
            } else {
                System.out.println("Clau incorrecta");
            }

            intents--;

        } while((intents > 0) && (!encertat));

        if (encertat) {
            System.out.println("Heu obert.");
        } else {
            System.out.println("Lamentablement heu exhaurit el 4 intents.");
        }
    }
}