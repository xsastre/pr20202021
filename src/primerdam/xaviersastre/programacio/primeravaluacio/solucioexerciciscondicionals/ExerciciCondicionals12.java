package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Realitza un programa que faci un petit qüestionari amb 10 preguntes
 *              tipus test sobre les assignatures que s’imparteixen al CF. Cada pregunta
 *              encertada sumarà un punt. El programa mostrarà al final del qüestionari
 *              la qüalificació. Passeu el vostre qüestionari als vostres companys de
 *              classe i demaneu-lis que el facin per així saber com aneu de coneixements
 *              del curs.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals12 {

    public static void main(String[] args) {

        int punts = 0;
        String resposta;

        System.out.println("QÜESTIONARI DE 1r DAM");

        System.out.println("1. Quin dels següents tipus de dades en Java té més precisió?");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("=> ");
        resposta = System.console().readLine();
        if (resposta.equals("b")) {
            punts++;
        }

        System.out.println("2. Quin és llenguatge que s'utilitza per fer consultes a les bases de dades?");
        System.out.println("a) XML\nb) SELECT\nc) SQL");
        System.out.print("=> ");
        resposta = System.console().readLine();
        if (resposta.equals("c")) {
            punts++;
        }

        System.out.println("3. Per inserir un hiperenllaç en una pàgina s'utilitza l'etiqueta...");
        System.out.println("a) href\nb) a\nc) link");
        System.out.print("=> ");
        resposta = System.console().readLine();
        if (resposta.equals("b")) {
            punts++;
        }

        System.out.println("4. En quin directori es troben els arxius de configuració de Linux?");
        System.out.println("a) /etc\nb) /config\nc) /cfg");
        System.out.print("=> ");
        resposta = System.console().readLine();
        if (resposta.equals("a")) {
            punts++;
        }

        System.out.println("5. Quina de les següents memòries és volàtil?");
        System.out.println("a) RAM\nb) EPROM\nc) ROM");
        System.out.print("=> ");
        resposta = System.console().readLine();
        if (resposta.equals("a")) {
            punts++;
        }

        System.out.println("\nHas obtingut " + punts + " punts.");
    }
}
