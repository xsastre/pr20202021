package primerdam.xaviersastre.programacio.primeravaluacio;
/*
 *       Filename:  Operadors19.java
 *
 *    Description:
 *
 *        Created:  30 d’oct. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */

public class Operadors19 {
    public static void main(String[] args) {
        int total=1;
        int x=1;
        total -= x--;
        System.out.println(total);
        System.out.println(x);
        // Observeu la diferència
        total=1;
        x=1;
        total -= --x;
        System.out.println(total);
        System.out.println(x);

    }
}
