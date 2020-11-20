package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description: Escriu un programa que mostri els n primers termes de la successió
 *              (série) de Fibonacci i el nombre n ha de ser introduït per teclat
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles12 {

    public static void main(String[] args) {

        System.out.println("Aquest programa mostra els n primer nombres de la serie de Fibonacci.");
        System.out.print("Per favor, introduiu n: ");
        int n = Integer.parseInt(System.console().readLine());

        switch (n) {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;
            default:
                System.out.print("0 1");
                int f1 = 0;
                int f2 = 1;
                int aux;
                while(n > 2) {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" " + f2);
                    n--;
                }
        }
        System.out.println();
    }
}
