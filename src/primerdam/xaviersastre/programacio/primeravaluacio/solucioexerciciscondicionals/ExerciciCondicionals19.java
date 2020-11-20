package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 * Description: Calcula la nota d’un trimestre del mòdul de programació. El programa
 *              demanarà dues notes que l’alumne avaluat ha tret en els dos primers
 *              controls. Si la mitjana ponderada (1ª nota 40% i 2ª nota 60%) és major
 *              o igual a 5, aleshores l’alumne ha aprovat i mostrarà la mitjana.
 *              En cas contrari, l’alumne haurà fet un examen de recuperació que es
 *              qualifica com a “apte” o “no apte”, per tant s’haurà de demanar quin
 *              ha estat el resultat de la recuperació. Si el resultat de la recuperació
 *              és apte, la nota serà un 5. En cas contrari es mantindrà la mitjana
 *              anterior.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciCondicionals19 {
    public static void main(String[] args) {

        System.out.print("Nota del primer control: ");
        double nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("Nota del segon control: ");
        double nota2 = Double.parseDouble(System.console().readLine());

        double mitjana = (nota1 + nota2) / 2;

        if (mitjana < 5) {
            System.out.print("Quin ha estat el resultat de la recuperació? (apte/no apte): ");
            String recuperacio = System.console().readLine();
            if (recuperacio.equals("apte")) {
                mitjana = 5;
            }
        }

        System.out.print("La teva nota de Programació és " + mitjana);
    }
}
