package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Escriu un programa que donada una hora concreta (hores i minuts)
 *              calculi els segons que falten per arribar a mitjanit.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals11 {

    public static void main(String[] args) {

        System.out.print("A continuació introduiu una hora del dia ");
        System.out.println("primer l'hora i després els minuts.");

        System.out.print("hora: ");
        int hora = Integer.parseInt(System.console().readLine());

        System.out.print("minut: ");
        int minut = Integer.parseInt(System.console().readLine());

        int segonsTranscorreguts = (hora * 3600) + (minut * 60);
        int segonsFinsMitjanit = (24 * 3600) - segonsTranscorreguts;

        //System.out.println("Des de les " + hora + ":" + minuto + " fins a mitjanit falten " + segonsFinsMitjanit + " segons.");
        System.out.printf("Des de les %02d:%02d fins a mitjanit falten faltan %d segons", hora, minut, segonsFinsMitjanit);
    }
}
