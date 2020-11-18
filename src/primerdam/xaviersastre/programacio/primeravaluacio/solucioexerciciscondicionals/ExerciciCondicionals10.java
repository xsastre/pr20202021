package primerdam.xaviersastre.programacio.primeravaluacio.solucioexerciciscondicionals;

/**
 *       Filename:  ExerciciCondicionals10
 *
 *    Description:  Escriu un programa que ens digui l’horòscop al que es pertany a
 *                  partir del dia i mes de naixement.
 *
 *        Created:  13 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExerciciCondicionals10 {

    public static void main(String[] args) {

        String horoscop = "";

        System.out.println("Aqeust programa vos dirà quin és el vostre horòscop a partir de la vostre data de naixement.");
        System.out.print("Introduiu el nombre del mes en que vàreu néixer (1-12): ");
        int mes = Integer.parseInt(System.console().readLine());

        System.out.print("Ara introduiu el dia: ");
        int dia = Integer.parseInt(System.console().readLine());

        switch(mes) {
            case 1:
                if (dia < 21) {
                    horoscop = "capricorn";
                } else {
                    horoscop = "aquari";
                }
                break;
            case 2:
                if (dia < 20) {
                    horoscop = "aquari";
                } else {
                    horoscop = "peixos";
                }
                break;
            case 3:
                if (dia < 21) {
                    horoscop = "peixos";
                } else {
                    horoscop = "aries";
                }
                break;
            case 4:
                if (dia < 21) {
                    horoscop = "aries";
                } else {
                    horoscop = "taure";
                }
                break;
            case 5:
                if (dia < 20) {
                    horoscop = "taure";
                } else {
                    horoscop = "bessons";
                }
                break;
            case 6:
                if (dia < 22) {
                    horoscop = "bessons";
                } else {
                    horoscop = "càncer";
                }
                break;
            case 7:
                if (dia < 22) {
                    horoscop = "càncer";
                } else {
                    horoscop = "lleó";
                }
                break;
            case 8:
                if (dia < 24) {
                    horoscop = "lleó";
                } else {
                    horoscop = "verge";
                }
                break;
            case 9:
                if (dia < 23) {
                    horoscop = "verge";
                } else {
                    horoscop = "balança";
                }
                break;
            case 10:
                if (dia < 23) {
                    horoscop = "balança";
                } else {
                    horoscop = "escorpí";
                }
                break;
            case 11:
                if (dia < 23) {
                    horoscop = "escorpí";
                } else {
                    horoscop = "sagitari";
                }
                break;
            case 12:
                if (dia < 21) {
                    horoscop = "sagitari";
                } else {
                    horoscop = "capricorn";
                }
                break;
            default:
        }

        System.out.print("El vostre horòscop és " + horoscop);

    }
}
