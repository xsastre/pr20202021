package primerdam.xaviersastre.programacio.primeravaluacio;
/*
 *       Filename:  OrdreOperadors2.java
 *
 *    Description:  Crear una classe que contingui un float i l'utilitzem per demostrar
 *                  aliasing durant una crida a un mètode.
 *
 *        Created:  30 d’oct. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
/*
Exercise Operadors2: Crear una classe que contingui un float i l'utilitzem per demostrar
aliasing durant una crida a un mètode.
*/

class FloatDataEx2 {
    float a = 0.0f;
    float b = 0.0f;
    float c = 0.0f;
    void showData() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class Operadors2 {
    private static void increment(FloatDataEx2 f) {
        f.a++;
        f.b++;
        f.c++;
    }
    public static void main(String[] args) {
        FloatDataEx2 fd = new FloatDataEx2();
        fd.showData();
        increment(fd);
        fd.showData();
    }
}