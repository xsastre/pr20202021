package primerdam.xaviersastre.programacio.primeravaluacio;
/*
 *       Filename:  OrdreOperadors.java
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
public class OrdreOperadors {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z; // (1)
        int b = x + (y - 2)/(2 + z); // (2)
        System.out.println("a = " + a + " b = " + b);
    }
} /* Output:
a = 5 b = 1
*///:~