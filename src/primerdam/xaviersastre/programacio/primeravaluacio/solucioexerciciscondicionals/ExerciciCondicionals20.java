package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Realitza un programa que, donat un dia de la setmana (de dilluns a divendres)
 *              i una hora (hores i minuts), calculi quants de minuts falten pel cap de
 *              setmana. Es considera que el cap de setmana comença divendres a les
 *              15:00hrs. Es dóna per fet que l’usuari introduirà un dia i una hora
 *              correctes, anteriors al divendres a les 15:00
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals20 {
    public static void main(String[] args) {

        System.out.print("Per favor, introduiu un dia de la setmana (de dilluns a divendres): ");
        String dia = System.console().readLine();

        int nombreDeDia = 0;

        switch(dia) {
            case "dilluns":
                nombreDeDia = 0;
                break;
            case "dimarts":
                nombreDeDia = 1;
                break;
            case "dimecres":
                nombreDeDia = 2;
                break;
            case "dijous":
                nombreDeDia = 3;
                break;
            case "divendres":
                nombreDeDia = 4;
                break;
            default:
                System.out.print("El dia introduit no és correcte.");
        }

        System.out.println("A continuació introduiu l'hora (hora i minuts)");

        System.out.print("Hora: ");
        int hores = Integer.parseInt(System.console().readLine());

        System.out.print("Minuts: ");
        int minuts = Integer.parseInt(System.console().readLine());

        int minutsTotals = (4 * 24 * 60) + (15 * 60);
        int minutsActuals = (nombreDeDia * 24 * 60) + (hores * 60) + minuts;

        System.out.print("Falten " + (minutsTotals - minutsActuals) + " minuts per arribar al cap de setmana.");
    }
}
